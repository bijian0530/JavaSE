package com.Test01.ReflectTest04;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.Test01.ReflectTest04.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
