package com.oop.cs.threads;

public class WithdrawThread implements Runnable {

    private Account account;
    private double amount;
    public WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
//make a withdraw
        account.withdraw(amount);
    }
}
