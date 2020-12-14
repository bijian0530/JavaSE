package com.javase.Homework02;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(3);
        Tank tank = new Tank();
        GaoShePao gaoshepao = new GaoShePao();
        ZhanDouJi zhandouji = new ZhanDouJi();
        YunShuJi yunshuji = new YunShuJi();
        try {
            army.addWeapon(yunshuji);
            army.addWeapon(tank);
            army.addWeapon(gaoshepao);
           // army.addWeapon(zhandouji);
        } catch (AddWeaponException e) {
            e.printStackTrace();
        }
        army.allMove();
        army.allAttack();
    }
}
