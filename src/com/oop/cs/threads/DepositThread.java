package com.oop.cs.threads;

public class DepositThread implements Runnable {

    private Account account;
    private double amount;

    public DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
//make a deposit
        account.deposit(amount);
    }
}
