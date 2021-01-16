package com.Test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(100);
        c.add(200);
        c.add(100);
        c.add(new Object());
        c.add(300);
        c.add(new Student());
        c.add(50);
        System.out.println(c.size());
        c.remove(100);
        System.out.println(c.size());
        //转化成为数组
        /*Object[] obj = c.toArray();
        for(int i =0; i< obj.length;i++){
            Object o = obj[i];
            System.out.println(o);
        }*/
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
class Student{

}
