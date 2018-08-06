package com.renguanyu.tool.geocoding.test;

import com.renguanyu.tool.geocoding.model.Geo;
import com.renguanyu.tool.geocoding.model.Geocode;
import com.renguanyu.tool.geocoding.util.GaodeUtil;
import com.renguanyu.tool.geocoding.util.HibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GeoTest1 {


    /**
     * 动态切换key,并刷新项目xy
     * 用于大批量不间断刷值
     */
    @Test
    public final void test0() {
//        String address = "中国江苏省宿迁市沭阳县沭阳县经济开发区北经二路10号";
        writeLog("开始并启动刷新程序");
        List<String> keys = getGeokeysList();
        List<Map<String,String>> projects = listProjects();
        int projectSize = projects.size();
        writeLog("获取项目数据,共"+projectSize+"条");
        int keyIndex = 0;


        Integer currentKeyIndex = 0;
        Integer keysSize = keys.size();
        String currentKey = keys.get(currentKeyIndex);

        GaodeUtil gaodeUtil = new GaodeUtil();
        gaodeUtil.setKey(currentKey);
        Geo geo = null;
        Map<String,String> project = null;
        String projectAddress = null;
        String projectId = null;
        for (int i = 0; i < projectSize; i++) {
            System.out.println(i);
            //获取项目
            project = projects.get(i);
            if(project!=null){
                //获取项目ID
                projectId = project.get("ID");
                //获取项目的地址
                projectAddress = project.get("ADDR");
                if(projectAddress!=null){
                    geo = gaodeUtil.geo(projectAddress);
                    System.out.println(geo);
                    if(geo!=null){
                        String status = geo.getStatus();
                        String count = geo.getCount();
                        String info = geo.getInfo();
                        //状态是0代表已经到了单个app的上限
                        if("DAILY_QUERY_OVER_LIMIT".equals(info)){
                            //切换app的key
                           if(currentKeyIndex<keysSize-1){
                               currentKeyIndex++;
                               currentKey = keys.get(currentKeyIndex);
                               gaodeUtil.setKey(currentKey);
                               i--;
                           }

                            //如果没有key了,那就终止程序了
                            else{
                                writeLog("没有可以用的key了,结束循环体");
                                break;
                            }
                        }
                        else if("UNKNOWN_ERROR".equals(info)){
                            continue;
                        }
                        //状态是1并且计数为1,代表成功转换
                        else if("OK".equals(info)&&"1".equals(count)){

                            //把高德响应的数据更新到数据库中
                            List<Geocode> geocodes = geo.getGeocodes();
                            if(geocodes!=null){
                                Geocode geocode = geocodes.get(0);
                                String lat = geocode.getLat();
                                String lng = geocode.getLng();
                                updateProjectXY(projectId,lat,lng);
                            }

                        }

                    }
                }
            }
        }
        writeLog("结束并关闭刷新程序");
        //Geo{status='0', count='null', info='DAILY_QUERY_OVER_LIMIT', geocodes=null}
        //Geo{status='0', count='null', info='UNKNOWN_ERROR', geocodes=null}
        //Geo{status='1', count='1', info='OK'
    }



    private List<Map<String,String>> listProjects() {
        Session session = HibernateSessionFactory.getSession();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("pm.PM_PROJECT_SURVEY.ID  ");
        sql.append(",pm.PM_PROJECT_SURVEY.LNG SMX ");
        sql.append(",pm.PM_PROJECT_SURVEY.LAT SMY  ");
        sql.append(",UAMS.SYS_AREA.MERGER_NAME||pm.PM_PROJECT_SURVEY.CONSTRPLACEINFO ADDR  ");
        sql.append("FROM ");
        sql.append("pm.PM_PROJECT_SURVEY ");
        sql.append("INNER JOIN UAMS.SYS_AREA ON UAMS.SYS_AREA.ID = pm.PM_PROJECT_SURVEY.CONSTRPLACE ");
        SQLQuery sqlQuery = session.createSQLQuery(sql.toString());
        sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        sqlQuery.setFirstResult(0);
//        sqlQuery.setMaxResults(10);
        List<Map<String,String>> list = sqlQuery.list();
//        System.out.println(list);
        session.close();
        return list;
    }


    private List<String> getGeokeysList(){
        URL resourceURL = getClass().getResource("/geoKeys.txt");
        String resourceStringPath = resourceURL.getPath();
//        System.out.println(resourceStringPath);

        List<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(resourceStringPath))) {
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(lines);
        writeLog("获取key集合,共"+lines.size()+"个");
        return lines;
    }


    private void updateProjectXY(String id,String smx,String smy) {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update PmProjectSurvey project set project.lng = :smx,project.lat= :smy  where project.id = :id ";
        try{
            Query query = session.createQuery(hql);
            query.setString("id",id);
            query.setString("smx",smx);
            query.setString("smy",smy);
            int i = query.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        transaction.commit();
        session.close();
    }

    private void writeLog(String content) {
        String resource = getClass().getResource("/tmpLog.txt").getPath();
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern ("yyyy-mm-dd HH:mm:ss");
        try(FileWriter fileWriter = new FileWriter(resource, true);) {
            LocalDateTime now = LocalDateTime.now();
            String nowString = now.format(dateTimeFormatter);
            //System.out.println(nowString);
            fileWriter.write(nowString);
            fileWriter.write(" ");
            fileWriter.write(content);
            fileWriter.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

