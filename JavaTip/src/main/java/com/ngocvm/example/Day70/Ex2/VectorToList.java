package com.ngocvm.example.Day70.Ex2;

import java.util.LinkedList;
import java.util.List;

public class VectorToList {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<Student>();

        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Bill"));
        students.add(new Student("Henry"));

        students.forEach(s -> System.out.println(s));
    }
}
