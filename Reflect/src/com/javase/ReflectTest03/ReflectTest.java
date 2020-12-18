package com.javase.ReflectTest03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("Reflect/src/classinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
