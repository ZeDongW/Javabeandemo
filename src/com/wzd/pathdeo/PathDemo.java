package com.wzd.pathdeo;

import javafx.beans.property.Property;

import java.io.*;
import java.util.Properties;

/**
 * @author ：Administrator
 * @title :PathDemo
 * @projectName :Javabeandemo
 * @description：java的路径问题
 * @version: 1.0
 * @date ：Created in 2019/04/06/0006 9:17
 * @modified By：
 */
public class PathDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("resource/db.properties")));
        System.out.println("当前路径：" + new File("").getAbsolutePath());
        InputStream resourceAsStream = PathDemo.class.getClassLoader().getResourceAsStream("db.properties");
//        InputStream resourceAsStream = PathDemo.class.getResourceAsStream("/com/db.properties");
        properties.load(resourceAsStream);
        System.out.println("用户名：" + properties.getProperty("username") + "  密码：" + properties.getProperty("password"));
    }
}
