package com.Test03;

import java.util.HashSet;
import java.util.Set;

public class CollectionsTest02 {
    public static void main(String[] args) {
    Set<TanKe> tanKes = new HashSet<>();
    tanKes.add(new TanKe("hongji"));
    tanKes.add(new TanKe("tianzi"));
    tanKes.add(new TanKe("aanying"));
        for (TanKe tanke:tanKes
             ) {
            System.out.println(tanke);
        }
    }
}

class TanKe implements Comparable<TanKe>{
    String name;
    public TanKe(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "TanKe{" + name + '}';
    }

    @Override
    public int compareTo(TanKe o) {
        return this.name.compareTo(o.name);
    }
}