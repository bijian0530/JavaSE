package com.javase.Homework01;

public class Test {
    public static void main(String[] args) {
        Userservise userservice = new Userservise();
        try {
            userservice.register("jam12346","123");
        } catch (IlleagalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
