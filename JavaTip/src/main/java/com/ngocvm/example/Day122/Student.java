package com.ngocvm.example.Day122;

import java.io.Serializable;

public class Student implements Serializable {
    public static final long serialVersionUID = 1234L;
    private long studentId;
    private String name;
    private transient int age;

    public Student(long studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        System.out.println("Constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void foo() {}
}
