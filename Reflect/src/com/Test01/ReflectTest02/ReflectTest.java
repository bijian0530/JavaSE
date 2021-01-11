package com.Test01.ReflectTest02;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
            Class c = Class.forName("com.Test01.ReflectTest02.User");
            Object obj = c.newInstance();
        System.out.println(obj);
    }
}
