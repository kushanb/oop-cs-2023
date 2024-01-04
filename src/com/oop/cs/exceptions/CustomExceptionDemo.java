package com.oop.cs.exceptions;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is below 18: ", age, "lower");
            }
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
