package com.javase.ReflectTest01;

public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String s = "abc";
        Class x = s.getClass();
        System.out.println(c1 == x);
    }
}
