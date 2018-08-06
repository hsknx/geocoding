package com.renguanyu.tool.geocoding.test;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileTest {

    @Test
    public void test0(){

    }

    @Test
    public void test1(){
        String content = "asdasdasd";
        writeLog(content);

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

    @Test
    public void test2(){
        URL resourceURL = getClass().getResource("/tmpLog.txt");
        String resourceStringPath = resourceURL.getPath();
        System.out.println(resourceStringPath);
        method2(resourceStringPath,"a");
    }
    public void method2(String fileName, String content) {
        FileWriter writer = null;
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            writer = new FileWriter(fileName, true);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
