package com.Test03;

import java.util.TreeSet;

public class ComparableTest01 {
    public static void main(String[] args) {
      Customer c1 = new Customer(11);
      Customer c2 = new Customer(22);
      Customer c3 = new Customer(5);
      TreeSet<Customer> customers = new TreeSet<>();
      customers.add(c1);
      customers.add(c2);
      customers.add(c3);
        for (Customer c:customers
             ) {
            System.out.println(c);
        }
}
}

class Customer implements Comparable<Customer> {
    int age;
    public Customer(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "age=" + age +
                ']';
    }

    @Override
    public int compareTo(Customer o) {
        return this.age - o.age;
    }
}