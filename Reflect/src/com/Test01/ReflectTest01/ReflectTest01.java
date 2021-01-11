package com.Test01.ReflectTest01;

import java.util.Date;

public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1 = null;
        Class c2 = null;
        //第一种方法
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种方法
        String s = "abc";
        Class x = s.getClass();
        Date time  = new Date();
        Class y = time.getClass();
        System.out.println(c1 == x);
        System.out.println(c2 == y);
        //第三种方法
        Class z = String.class;
        Class w = Date.class;
        System.out.println(x == z);
        System.out.println(y == w);
    }
}
