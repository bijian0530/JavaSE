package com.Test01.ReflectTest05;

import java.util.ResourceBundle;


//使用绑定器的时候不需要使用文件的点缀名
public class ReflectTest02 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");
        String className = bundle.getString("className");
        System.out.println(className);

        String className2 = bundle.getString("className2");
        System.out.println(className2);
    }
}
