package com.Test02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"zhangsan");
        map.put(22,"lisi");
        map.put(33,"wangwu");
        Set<Map.Entry<Integer,String>> sets = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = sets.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println("key= "+key+" String="+value);
        }
        System.out.println("=========================");
        for (Map.Entry<Integer,String> set:sets
             ) {
            System.out.println(set.getKey()+set.getValue());
        }
    }
}
