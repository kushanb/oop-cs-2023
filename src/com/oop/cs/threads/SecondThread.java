package com.oop.cs.threads;

public class SecondThread extends Thread {
    @Override
    public void run() {
        super.run();

        System.out.println("Thread #2 started!");

        synchronized (this) {
            printThreadTwo();
            notify();
        }

        // If the 2nd thread completes running, stop the thirst thread
//        ThirdThread.toggleIsRunning();
    }

    public void printThreadTwo() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("=======Thread 02: " + i);
            try {
//                sleep(2000);
                sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
