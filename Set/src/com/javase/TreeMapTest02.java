package com.javase;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        ts.add(1);
        ts.add(97);
        ts.add(50);
        ts.add(7);
        ts.add(100);
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>");

        for(Integer i : ts){
            System.out.println(ts);
        }
    }
}
