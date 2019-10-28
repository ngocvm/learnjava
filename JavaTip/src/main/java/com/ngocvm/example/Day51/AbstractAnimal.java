package com.ngocvm.example.Day51;

public abstract class AbstractAnimal implements Animal{
    protected double height;
    protected double weight;
    protected String color;
    protected String breed;

    public void move() {
        System.out.println("Moving...");
    }

    public void eat() {
        System.out.println("Eating ...");
    }

    public void sleep() {
        System.out.println("Sleeping ...");
    }
}
