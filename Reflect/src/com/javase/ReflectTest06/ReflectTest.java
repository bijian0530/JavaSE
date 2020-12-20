package com.javase.ReflectTest06;

import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("com.javase.ReflectTest06.Student");
        String className = studentClass.getName();
        System.out.println(className);
        //获取所有的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        Field f = fields[0];
        String fieldName = f.getName();
        System.out.println(fieldName);
        System.out.println("============================");
        //不管前面修饰的属性都可以全部拿出来
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);
        for (Field field2:fs
             ) {
            System.out.println(field2.getName());
        }
        String className2 = studentClass.getName();
        System.out.println(className2);
        String simpleName = studentClass.getSimpleName();
        System.out.println(simpleName);
    }
}
