package com.Test02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("tempfile");
            char[] chars = new char[20];
            /*int readCount = 0;
            while((readCount = reader.read(chars))!=-1){
                System.out.println(new String(chars,0,readCount));
            }*/
            reader.read(chars);
            for (char c : chars
                 ) {
                System.out.print(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
