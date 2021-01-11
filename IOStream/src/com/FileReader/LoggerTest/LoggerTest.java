package com.FileReader.LoggerTest;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class LoggerTest {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream("log");
            Logger.log("我是一个java软件工程师");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
