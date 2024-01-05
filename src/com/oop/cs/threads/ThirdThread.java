package com.oop.cs.threads;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ThirdThread implements Runnable {

    Scanner scanner;
    private static Boolean isRunning;

    @Override
    public void run() {

        isRunning = true;
        scanner = new Scanner(System.in);
        System.out.println("Thread #3 has started!");

        printThreadThree();
    }

    public void printThreadThree() {
        for(int i = 1; i <= 10; i++) {
            if (isRunning) {
                System.out.println("----------Thread 03: " + i);
//            if(i % 4 == 0) {
//                System.out.println("Enter a value for Thread #3");
//                String value = scanner.nextLine();
//                System.out.println("A value has been entered: " + value);
//            }
                try {
//                sleep(2000);
                    sleep(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
    }

    public static void toggleIsRunning() {
        isRunning = !isRunning;
    }
}
