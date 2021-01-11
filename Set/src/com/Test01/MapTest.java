package com.Test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"李六");
        map.put(5,"韩信");
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=====================");
        for(Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
