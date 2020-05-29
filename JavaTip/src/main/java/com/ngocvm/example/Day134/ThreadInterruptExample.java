package com.ngocvm.example.Day134;

public class ThreadInterruptExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(2000);
                continue;
            } catch (InterruptedException ex) {
                System.out.println("Interrupt " + ex);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadInterruptExample());
        t1.start();

        try {
            Thread.sleep(5000);
            t1.interrupt();
        } catch (InterruptedException ex) {
            System.out.println("Interrupt " + ex);
        }
    }
}
