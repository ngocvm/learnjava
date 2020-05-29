package com.ngocvm.example.Day134;

public class ThreadExample1 extends Thread{
    @Override
    public void run() {
        System.out.println("My name is: " + getName());
    }

    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();
        t1.start();

        System.out.println("My name is: " + Thread.currentThread().getName());
    }
}
