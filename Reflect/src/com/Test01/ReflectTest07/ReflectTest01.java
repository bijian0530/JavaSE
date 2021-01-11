package com.Test01.ReflectTest07;

import java.lang.reflect.Field;

public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        Student s = new Student();
        s.no = 10;
        System.out.println(s.no);
        //使用反射机制获取属性
        Class studentClass = Class.forName("com.Test01.ReflectTest07.Student");
        Object obj = studentClass.newInstance();
        Field noField = studentClass.getDeclaredField("no");
        System.out.println(noField.get(obj));
        noField.set(obj,10000);
        System.out.println(noField.get(obj));
        //读取私有化的属性
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装
        nameField.setAccessible(true);
        nameField.set(obj,"hijack");
        System.out.println(nameField.get(obj));
    }
}
