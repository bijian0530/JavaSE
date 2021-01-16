package com.Test02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"zhangsan");
        map.put(22,"wangwer");
        map.put(33,"sunsan");
        //遍历map集合的第一个方法
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(value);
        }
        System.out.println("利用key遍历map集合");
        for (Integer key:keys
             ) {
            System.out.println(key +"->"+ map.get(key));
        }
    }
}
