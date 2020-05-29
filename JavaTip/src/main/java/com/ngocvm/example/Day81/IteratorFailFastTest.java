package com.ngocvm.example.Day81;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorFailFastTest {
    private List list = new ArrayList();
    public IteratorFailFastTest() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public void runUpdateThread() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i < 20000; i++) {
                    list.add(i);
                }
            }
        });
        thread1.start();
    }

    public void runIteratorThread() {
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ListIterator iterator = list.listIterator();
                while(iterator.hasNext()) {
                    Integer number = (Integer) iterator.next();
                    System.out.println(number);
                }
            }
        });
        thread2.start();
    }

    public static void main(String[] args) {
        IteratorFailFastTest tester = new IteratorFailFastTest();
        tester.runIteratorThread();
        tester.runUpdateThread();
    }
}
