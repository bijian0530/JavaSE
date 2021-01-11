package com.Test01;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Customer c1 = new Customer(17);
        Customer c2 = new Customer(7);
        Customer c3 = new Customer(66);
        Customer c4 = new Customer(1);

        TreeSet<Customer> ts = new TreeSet<>();

        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        ts.add(c4);

        for (Customer customers : ts
             ) {
            System.out.println(customers);
        }
    }
}
class Customer implements  Comparable<Customer>{
    int age;
    public Customer(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}