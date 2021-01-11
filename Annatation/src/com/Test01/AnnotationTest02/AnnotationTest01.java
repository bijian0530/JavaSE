package com.Test01.AnnotationTest02;

public class AnnotationTest01 {
    public static void main(String[] args) {
        AnnotationTest01 at = new AnnotationTest01();

        at.doSome();
        at.doOther();
    }
    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }
    @Deprecated
    public void doOther(){
        System.out.println("do other...");
    }
}

class yaoyao{
    public static void main(String[] args) {
        AnnotationTest01 at = new AnnotationTest01();
        at.doOther();
        at.doSome();
    }
}
