package com.Test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<JiuDian> jiuDians = new ArrayList<>();
        jiuDians.add(new JiuDian(55));
        jiuDians.add(new JiuDian(11));
        jiuDians.add(new JiuDian(77));
        Collections.sort(jiuDians);
        for (JiuDian jiudian:jiuDians
             ) {
            System.out.println(jiudian);
        }
    }
}

class JiuDian implements Comparable<JiuDian>{
    int no;
    public JiuDian(int no){
        this.no = no;
    }

    @Override
    public int compareTo(JiuDian o) {
        return this.no-o.no;
    }

    @Override
    public String toString() {
        return "酒店" +
                "房间编号=" + no ;
    }
}
