package com.javase.Homework02;

public class GaoShePao extends Weapon implements Shotable{
    @Override
    public void shot() {
        System.out.println("高射炮开炮！");
    }
}
