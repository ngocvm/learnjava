package com.ngocvm.example.Day73;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> q) {
        queue = q;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(produce());
                Thread.sleep(500);
            }
            queue.put(-1);
            System.out.println("Producer STOPPED.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private Integer produce() {
        Integer number = new Integer((int) (Math.random() * 100));
        System.out.println("Producing number => " + number);
        return number;
    }
}
