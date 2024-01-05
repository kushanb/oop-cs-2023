package com.oop.cs.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double balance = 0;
    private Lock balanceLock;

    public Account(double balance) {
        this.balance = balance;
        balanceLock = new ReentrantLock();
    }

    public synchronized void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Can’t deposit.");
        } else {
            balanceLock.lock();
            this.balance += amount;
            System.out.println("Deposit" + amount + " in thread"
                    + Thread.currentThread().getId() + ", balance is " + balance);
            balanceLock.unlock();
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            System.out.println("Can’t withdraw.");
        } else {
            balanceLock.lock();
            this.balance -= amount;
            System.out.println("Withdraw" + amount + " in thread"
                    + Thread.currentThread().getId() + ", balance is " + balance);
            balanceLock.unlock();
        }
    }
}

