package com.Test03;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age-o2.age;
            }
        });
        wuGuis.add(new WuGui(100));
        wuGuis.add(new WuGui(5));
        wuGuis.add(new WuGui(50));
        wuGuis.add(new WuGui(77));
        wuGuis.add(new WuGui(27));
        for (WuGui wugui:wuGuis
             ) {
            System.out.println(wugui);
        }
    }
}

class WuGui{
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟[" +
                "age=" + age +
                ']';
    }
}

/*
class WuGuiComparator implements Comparator<WuGui>{
    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}*/
