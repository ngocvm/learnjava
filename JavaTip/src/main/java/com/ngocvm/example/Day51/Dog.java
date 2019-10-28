package com.ngocvm.example.Day51;

public class Dog extends AbstractAnimal {
    public Dog() {}

    public void bark() {
        System.out.println("Gow gow...");
    }

    public void run() {
        System.out.println("Dog running...");
    }

    @Override
    public void move() {
        run();
    }
}
