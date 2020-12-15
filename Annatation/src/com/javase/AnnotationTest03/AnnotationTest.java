package com.javase.AnnotationTest03;

import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.javase.AnnotationTest03.AnnotationTest");
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        if(doSomeMethod.isAnnotationPresent(MyAnnotationTest.class)){
            MyAnnotationTest myAnnotationTest = doSomeMethod.getAnnotation(MyAnnotationTest.class);
            System.out.println(myAnnotationTest.username());
            System.out.println(myAnnotationTest.password());
        }
    }

    @MyAnnotationTest(username = "bijian",password = "123")
    public void doSome(){
        String username = "yaoyao";
        String password = "520";
    }
}
