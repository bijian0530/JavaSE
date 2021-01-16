package com.Test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FanxingTest {
    public static void main(String[] args) {
        List<Animal> mylist = new ArrayList<Animal>();
        Cat c = new Cat();
        Bird b = new Bird();
        mylist.add(b);
        mylist.add(c);
        Iterator<Animal> it =mylist.iterator();
        while(it.hasNext()){
            Animal obj =it.next();
            if(obj instanceof Cat){
                Cat c1 =(Cat) obj;
                c1.catchMouse();
            }
            if(obj instanceof Bird){
                Bird b2 =(Bird)obj;
                b2.fly();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}