package com.javase.Homework02;

public class Tank extends Weapon implements Moveable,Shotable{
    @Override
    public void shot() {
        System.out.println("坦克开炮！");
    }

    @Override
    public void move(){
        System.out.println("坦克行走！");
    }
}
