package com.IoProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IoPropertiesTest01 {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("IOStream/src/com/IoProperties" +
                    "/file.properties");
            Properties pro = new Properties();
            pro.load(fs);
            String name = pro.getProperty("name");
            System.out.println(name);
            String password = pro.getProperty("password");
            System.out.println(password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
