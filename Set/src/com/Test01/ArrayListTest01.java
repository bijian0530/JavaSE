package com.Test01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        for(int i = 0; i < list.size(); i++){
            String elt = list.get(i);
            System.out.println(elt);
        }
        System.out.println("=======================");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("======================");
        for(String s : list){
            System.out.println(s);
        }
    }
}
