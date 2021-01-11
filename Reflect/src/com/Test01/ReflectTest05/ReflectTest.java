package com.Test01.ReflectTest05;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();
        //创建对象流
        FileReader reader = new FileReader("Reflect/src/classinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);

        //另外一个方法
        InputStream read = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo.properties");
        Properties pro2 = new Properties();
        pro2.load(read);
        read.close();
        String className2 = pro2.getProperty("className2");
        System.out.println(className2);

    }
}
