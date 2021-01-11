package com.Test01.AnnotationTest01;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Class userClass =  Class.forName("com.Test01.AnnotationTest01.User");
        if(userClass.isAnnotationPresent(id.class)){
            Field[] fields = userClass.getDeclaredFields();
            boolean isOK = false;

            for (Field field:fields
                 ) {
                if("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    isOK = true;
                    break;
                }
            }
            if(!isOK){
                throw new HasNotPropertyException("被id注释过的类中必须要有一个int的属性的id注释");
            }
        }
    }
}
