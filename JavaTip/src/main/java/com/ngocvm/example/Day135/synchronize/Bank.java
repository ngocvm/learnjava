package com.ngocvm.example.Day135.synchronize;

import com.ngocvm.example.Day135.reentrantlock.Account;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    public static final int MAX_ACCOUNT = 10;
    public static final int MAX_AMOUNT = 10;
    public static final int INITIAL_BALANCE = 100;

    private Account[] accounts = new Account[MAX_ACCOUNT];

    public Bank() {
        for (int i = 0; i < accounts.length; ++i) {
            accounts[i] = new Account(INITIAL_BALANCE);
        }

    }

    public synchronized void transfer(int from, int to, int amount) {
        try {
            while (accounts[from].getBalance() < amount) {
                wait();
            }
            accounts[from].withdraw(amount);
            accounts[to].deposit(amount);
            String message = "%s transferred %d from %s to %s. Total balance: %d\n";
            String threadName = Thread.currentThread().getName();
            System.out.printf(message, threadName, amount, from, to, getTotalBalance());
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized int getTotalBalance() {
        int total = 0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
}
