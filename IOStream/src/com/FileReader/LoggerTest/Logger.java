package com.FileReader.LoggerTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log(String msg) {
        PrintStream out = null;

        {
            try {
                out = new PrintStream(new FileOutputStream("log.txt"));
                System.setOut(out);
                Date nowTime = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
                String strTime = sdf.format(nowTime);
                System.out.println(nowTime);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                if (out != null) {
                    out.close();
                }
            }
        }
    }
}
