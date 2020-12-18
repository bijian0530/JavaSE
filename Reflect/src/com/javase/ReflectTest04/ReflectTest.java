package com.javase.ReflectTest04;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.javase.ReflectTest04.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
