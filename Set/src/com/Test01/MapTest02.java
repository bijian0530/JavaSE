package com.Test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02<set> {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "李六");
        map.put(5, "韩信");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + " " + value);
        }
        System.out.println("==================");
        for (Map.Entry<Integer, String> node : set) {
            System.out.println(node.getKey() + " " + node.getValue());
        }
    }
}
