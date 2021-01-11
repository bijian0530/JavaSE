package com.Test01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
       HashSet<String> sets = new HashSet<>();
       sets.add("zhangsan");
       sets.add("lisi");
       sets.add("wangwu");
       Iterator<String> it =sets.iterator();
       while(it.hasNext()){
           String s = it.next();
           System.out.println(s);
       }
        System.out.println("=========================");
       for(String s : sets){
           System.out.println(s);
       }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        Set<Student> students = new HashSet<>();

       Student s1 = new Student(1,"zhangsan");
       Student s2 = new Student(2,"lisi");
       Student s3 = new Student(3,"wangwu");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students.size());
        for(Student stu : students){
            System.out.println(stu);
        }
    }
}

class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
