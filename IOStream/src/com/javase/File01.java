package com.javase;

import java.io.File;

public class File01 {
    public static void main(String[] args) {
        File file1 = new File("d:/a/b");
        boolean flag1 = file1.mkdirs();
        System.out.println(flag1);
        File file2 = new File("d:/a/b/c");
        boolean flag2 = file2.isDirectory();
        System.out.println(file2);
    }
}
