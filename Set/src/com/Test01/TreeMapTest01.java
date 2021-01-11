package com.Test01;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMapTest01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(97);
        ts.add(50);
        ts.add(7);
        ts.add(100);
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        for(Integer i : ts){
            System.out.println(ts);
        }
    }
}
