package com.ngocvm.example.Day79;

public class Student implements Comparable<Student>{
    private  String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.score ;
    }

    @Override
    public int compareTo(Student o) {
        return o.getScore() - this.score;
    }
}
