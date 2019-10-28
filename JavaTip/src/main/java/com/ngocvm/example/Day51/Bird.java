package com.ngocvm.example.Day51;

public class Bird extends AbstractAnimal {
    public void fly() {
        System.out.println("Bird flying...");
    }

    @Override
    public void move() {
        fly();
    }
}
