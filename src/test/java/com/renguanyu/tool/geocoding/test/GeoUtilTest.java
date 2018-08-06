package com.renguanyu.tool.geocoding.test;

import com.renguanyu.tool.geocoding.entity.PmProjectSurvey;
import com.renguanyu.tool.geocoding.entity.SysArea;
import com.renguanyu.tool.geocoding.model.Geo;
import com.renguanyu.tool.geocoding.model.Geocode;
import com.renguanyu.tool.geocoding.util.GaodeUtil;
import com.renguanyu.tool.geocoding.util.HibernateSessionFactory;
import org.hibernate.*;
import org.hibernate.transform.Transformers;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class GeoUtilTest {

    @Test
    public final void test() {
    }
    @Test
    public final void queryProjectListData() {
        Session session = HibernateSessionFactory.getSession();
        StringBuilder hql = new StringBuilder();
        hql.append("select count(*) from PmProjectSurvey as project ");
        Query query = session.createQuery(hql.toString());
        query.setFirstResult(1);
        query.setMaxResults(2);

        List dataList =  query.list();
        System.out.println(dataList);

        HibernateSessionFactory.closeSession();
    }
    @Test
    public final void updateProjectLatLnt() {
    }
    @Test
    public final void hibernateTest1() {
        Session session = HibernateSessionFactory.getSession();
        Criteria createCriteria = session.createCriteria(PmProjectSurvey.class);
        createCriteria.setFirstResult(1);
        createCriteria.setMaxResults(10);
        List<PmProjectSurvey> pmProjectSurveyList = createCriteria.list();
        System.out.println(pmProjectSurveyList);
        System.out.println(pmProjectSurveyList.size());

        for(PmProjectSurvey projectSurvey:pmProjectSurveyList){
//            String constrplaceString = projectSurvey.getConstrplace();
            Criteria criteria = session.createCriteria(SysArea.class);


        }

        HibernateSessionFactory.closeSession();
    }
    @Test
    public final void updateProjectXY1() {

//        List<Map<String, Object>> dataList = getDataList();
//        System.out.println(dataList);
//        StringBuilder sql;
//
//
//        sql = new StringBuilder();
//        sql.append("UPDATE ");
//        sql.append("pm.PM_PROJECT_SURVEY ");
//        sql.append("SET ");
//        sql.append("pm.PM_PROJECT_SURVEY.LAT = :lat ");
//        sql.append(",PM.PM_PROJECT_SURVEY.LNG = :lnt ");
//        sql.append("WHERE  ");
//        sql.append("pm.PM_PROJECT_SURVEY.ID = :id ");
//
//        PmProjectSurvey projectSurvey = null;
//        Geo geo = null;
//        List<Geocode> geocodes = null;
//        Session session = HibernateSessionFactory.getSession();
//        Transaction tx = session.beginTransaction();
//         try{
//             for(Map<String,Object> data:dataList){
//                 String addrString = data.get("ADDR").toString();
//                 String idString = data.get("ID").toString();
//
//                 geo = GaodeUtil.geo(addrString);
//                 //System.out.println(geo);
//                 geocodes = geo.getGeocodes();
//
//                         String lngString = null;
//                 String latString = null;
//                 for(Geocode geocode : geocodes){
//                     lngString = geocode.getLng();
//                     latString = geocode.getLat();
//                 }
//
//                 projectSurvey = new PmProjectSurvey();
//                 projectSurvey.setId(idString);
//                 projectSurvey.setLng(lngString);
//                 projectSurvey.setLat(latString);
//                 session.update(projectSurvey);
//             }
//             tx.commit();
//             //System.out.println("保存成功!");
//         }catch(Exception e){
//             e.printStackTrace();
//             tx.rollback();
//             //System.out.println("保存失败!");
//         }
//
//        HibernateSessionFactory.closeSession();

    }

    @Test
    public void getDataList() {
        Session session = HibernateSessionFactory.getSession();
        StringBuilder hql = new StringBuilder();
//        sql.append("select ");
//        sql.append("project.id ");
//        sql.append(",area.mergerName ");
//        sql.append(",PmProjectSurvey.constrplace ");
//        sql.append("from ");
//        sql.append("PmProjectSurvey project");
//        sql.append("join project.constrplace ");
        hql.append("select ");
        hql.append("project ");
        hql.append("from ");
        hql.append("PmProjectSurvey project");
        Query query = session.createQuery(hql.toString());
        query.setFirstResult(1);
        query.setMaxResults(1);

        List<PmProjectSurvey> dataList = (List<PmProjectSurvey>)query.list();
        System.out.println(dataList);
        HibernateSessionFactory.closeSession();
    }

    @Test
    public final void hiberUpdate() {
//         Session session = HibernateSessionFactory.getSession();
//         Transaction tx = session.beginTransaction();
//         try{
//             PmProjectSurvey projectSurvey = new PmProjectSurvey();
//             projectSurvey.setLat("");
//             projectSurvey.setLng("");
//             session.update(projectSurvey);
//             tx.commit();
//             System.out.println("保存成功!");
//         }catch(Exception e){
//             e.printStackTrace();
//             tx.rollback();
//             System.out.println("保存失败!");
//         }finally{
//             HibernateUtil.closeSession();
//         }

     }


    /**
     * 查询所有的项目信息
     * @throws SQLException
     */
//    @Test
//    public void listProjects() throws SQLException {
//        OracleDataSource ds = new OracleDataSource();
//        ds.setURL("jdbc:oracle:thin:@10.2.146.102:1521/orcl");
//        ds.setUser("pm");
//        ds.setPassword("pm");
//
//        QueryRunner runner = new QueryRunner(ds);
//        MapListHandler mapListHandler = new MapListHandler();
//        String sql = "select * from pm_project_survey ";
//        Object[] params = {"4affaa1f1198c23801119e0bcddb1c23_315_10100"};
//        List<Map<String,Object>> results = runner.query(sql, mapListHandler, params);
//
//        System.out.println(results);
//
//
//    }


    @Test
    public final void test2() {
        String address = "中国江苏省宿迁市沭阳县沭阳县经济开发区北经二路10号";
        String key = "31ce20ad0cf0a8e3332bdffca7202a41";
        GaodeUtil gaodeUtil = new GaodeUtil();
        gaodeUtil.setKey(key);
        Geo geo = null;
        for (int i = 0; i < 6000; i++) {
            geo = gaodeUtil.geo(address);
            System.out.println(geo);
        }
        //Geo{status='0', count='null', info='DAILY_QUERY_OVER_LIMIT', geocodes=null}
    }

    /**
     * 动态切换key,并刷新项目xy
     * 用于大批量不间断刷值
     */
    @Test
    public final void test3() {
//        String address = "中国江苏省宿迁市沭阳县沭阳县经济开发区北经二路10号";
        List<String> keys = getGeokeysList();
        List<Map<String,String>> projects = listProjects();
        int projectSize = projects.size();
        int keyIndex = 0;

        Iterator<String> iterator = keys.iterator();
        String currentKey = iterator.next();

        GaodeUtil gaodeUtil = new GaodeUtil();
        gaodeUtil.setKey(currentKey);
        Geo geo = null;
        Map<String,String> project = null;
        String projectAddress = null;
        String projectId = null;
        for (int i = 0; i < 10; i++) {
            //获取项目
            project = projects.get(i);
            if(project!=null){
                //获取项目ID
                projectId = project.get("ID");
                //获取项目的地址
                projectAddress = project.get("ADDR");
                if(projectAddress!=null){
                    geo = gaodeUtil.geo(projectAddress);
                    if(geo!=null){
                        String status = geo.getStatus();
                        //状态是0代表已经到了单个app的上限
                        if("0".equals(status)){
                            //切换app的key
                            if(iterator.hasNext()){
                                currentKey = iterator.next();
                                gaodeUtil.setKey(currentKey);
                            }
                            //如果没有key了,那就终止程序了
                            else{
                                break;
                            }
                        }
                        //状态是1代表成功转换
                        if("1".equals(status)){
                            System.out.println(geo);
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
        //Geo{status='0', count='null', info='DAILY_QUERY_OVER_LIMIT', geocodes=null}
    }


    @Test
    public final void test1() {
//        JSONObject jsonObject = GaodeUtil.geo("方恒国际中心A座", "北京");
//        System.out.println(jsonObject);
    }
    @Test
    public final void test11() {
        listProjects();
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
        System.out.println(list);
        session.close();
        return list;
    }

    @Test
    public final void test10() throws IOException {
        getGeokeysList();
    }

    private List<String> getGeokeysList(){
        URL resourceURL = getClass().getResource("/geoKeys.txt");
        String resourceStringPath = resourceURL.getPath();
        System.out.println(resourceStringPath);

        List<String> lines = new LinkedList<>();
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
        System.out.println(lines);
        return lines;
    }


    @Test
    public final void test0() throws Exception {
        URL resourceURL = getClass().getResource("/geoKeys.txt");
        String resourceString = resourceURL.toString();
        System.out.println(resourceString);

        URL resource = getClass().getResource("/hibernate.cfg.xml");
        System.out.println(resource);
    }

    @Test
    public final void test20(){
        String id = "4affaa1f11eb4a440111eeed0521047c";
        String smx = "11111";
        String smy = "1111";
        updateProjectXY(id,smx,smy);
    }

    private void updateProjectXY(String id,String smx,String smy) {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update PmProjectSurvey project set project.lng = :smx,project.lat= :smy  where project.id = :id ";
        Query query = session.createQuery(hql);
        query.setString("id",id);
        query.setString("smx",smx);
        query.setString("smy",smy);
        int i = query.executeUpdate();
        System.out.println(i);
        transaction.commit();
        session.close();
    }
}

