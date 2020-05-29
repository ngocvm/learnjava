package com.ngocvm.example.Day134;

public class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable task = new ThreadExample2();
        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("My main name is: " + Thread.currentThread().getName());
    }
}
