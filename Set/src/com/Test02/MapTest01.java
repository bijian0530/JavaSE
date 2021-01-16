package com.Test02;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"zhansan");
        map.put(22,"lisi");
        map.put(33,"wangwu");
        map.put(44,"lisi");
        String s1 = map.get(11);
        System.out.println(s1);
        System.out.println("键值对的数目: " + map.size());
        map.remove(44);
        System.out.println("键值对的数目: " + map.size());
        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("lisi"));
    }
}
