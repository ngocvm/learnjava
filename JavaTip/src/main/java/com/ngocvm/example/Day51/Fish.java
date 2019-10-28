package com.ngocvm.example.Day51;

public class Fish extends AbstractAnimal{
    public void swim() {
        System.out.println("Fish swimming ...");
    }

    @Override
    public void move() {
        swim();
    }
}
