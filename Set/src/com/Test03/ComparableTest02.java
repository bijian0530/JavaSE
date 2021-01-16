package com.Test03;

import java.util.TreeSet;

public class ComparableTest02 {
    public static void main(String[] args) {
        TreeSet<Customer1> customers = new TreeSet<>();
        customers.add(new Customer1(55,"zhangsan"));
        customers.add(new Customer1(11,"lisi"));
        customers.add(new Customer1(33,"wangwu"));
        for (Customer1 c:customers
             ) {
            System.out.println(c);
        }
    }
}

class Customer1 implements Comparable<Customer1>{
    int age;
    String name;
    public Customer1(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name ;
    }

    @Override
    public int compareTo(Customer1 o) {
        if(this.age == o.age){
            return this.name.compareTo(o.name);
        }
        return this.age-o.age;
    }
}
