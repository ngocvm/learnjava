package com.ngocvm.example.Day113;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String name;
    private Date birthDay;
    private boolean gender;
    private int age;
    private float grade;

    public Student() {

    }

    public Student(String name, Date birthDay, boolean gender, int age, float grade) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
