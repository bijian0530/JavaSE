package com.javase.ReflectTest08;

public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class stringClass = Class.forName("java.lang.String");
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());
        //获取String类实现的所有接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in :interfaces
             ) {
            System.out.println(in.getName());
        }
    }
}
