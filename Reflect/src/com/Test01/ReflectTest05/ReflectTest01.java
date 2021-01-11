package com.Test01.ReflectTest05;

public class ReflectTest01 {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();
        System.out.println(path);

        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com.javase.ReflectTest05.infoclass2.properties").getPath();
        System.out.println(path2);
    }
}
