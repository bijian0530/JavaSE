package com.Test01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(500));
        wuGuis.add(new WuGui(700));
        for (WuGui w:wuGuis
             ) {
            System.out.println(w);
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
        return "WuGui{" +
                "age=" + age +
                '}';
    }

}
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}