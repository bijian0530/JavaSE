package com.Test01.ReflectTest08;

import java.lang.reflect.Constructor;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Vip v1 = new Vip();
        Vip v2 = new Vip(10,"zhangsan","2020",true);
        Class c = Class.forName("com.Test01.ReflectTest08.Vip");
        Object obj = c.newInstance();
        System.out.println(obj);
        //调用参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        Object newobj = con.newInstance(10,"jack","2020",true);
        System.out.println(newobj);
        //调用无参数构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object newobj2 = con2.newInstance();
        System.out.println(newobj2);
    }
}
