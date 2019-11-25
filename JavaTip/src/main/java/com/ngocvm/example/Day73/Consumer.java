package com.ngocvm.example.Day73;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer number = queue.take();
                if (number == -1) {
                    break;
                }

                consumer(number);
                Thread.sleep(1000);
            }
            System.out.println("Consumer STOPPED.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void consumer(Integer number) {
        System.out.println("Consuming number <= " + number);
    }
}
