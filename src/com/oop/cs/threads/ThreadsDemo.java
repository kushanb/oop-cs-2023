package com.oop.cs.threads;

import trialPackage.threads.ThreadThree;

public class ThreadsDemo {

    public static void main(String[] args) {

        // Inheriting from the Threads class
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        // Implementing the Runnable Interface
        ThirdThread runnableThread1 = new ThirdThread();
        Thread thread3 = new Thread(runnableThread1);

//        thread1.setPriority(Thread.MAX_PRIORITY);

//        thread1.start();
//        thread2.start();
//        thread3.start();

//        thread1.printThreadOne();
//        thread2.printThreadTwo();



//        new FirstThread().start();
//        new SecondThread().start();
//        new Thread(new ThirdThread()).start();

        // For synchronised

        thread1.start();
        thread2.start();

        synchronized (thread2) {
            try {
                System.out.println("Waiting for thread2 to complete...");
                thread2.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread2 has completed!");

        }
    }
}
