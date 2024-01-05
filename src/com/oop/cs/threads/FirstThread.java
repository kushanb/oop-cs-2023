package com.oop.cs.threads;

public class FirstThread extends Thread {


    @Override
    public void run() {
        super.run();

        System.out.println("Thread #1 started!");

        printThreadOne();
    }

    public void printThreadOne() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("****Thread 01: " + i);
            try {
//                sleep(2000);
                sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
