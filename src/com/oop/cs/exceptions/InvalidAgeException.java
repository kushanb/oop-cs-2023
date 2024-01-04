package com.oop.cs.exceptions;

public class InvalidAgeException extends Exception{
    private int age;

    /**
     * Basic age exception with a message
     * @param message message to be displayed
     */
    public InvalidAgeException(String message) {
        super(message);
    }

    /**
     * Age validation exception with added information
     *
     * @param message message to be displayed
     * @param age age that was entered
     */
    public InvalidAgeException(String message, int age, String difference) {
        super("Age was " + difference + "than 18: " + age);
    }
}
