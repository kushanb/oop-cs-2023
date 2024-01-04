package com.oop.cs.testing;

public class Calculator {

    /**
     * Default constructor for the calculator
     */
    public Calculator() {
        super();
    }

    /**
     * Adds two numbers together
     *
     * @param num1 first number
     * @param num2 second number
     * @return addition of the 2 numbers
     */
    public int addNums(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers from each other
     *
     * @param num1 first number
     * @param num2 second number
     * @return subtracted value for the numbers
     */
    public int subNums(int num1, int num2) {
        return num1 - num2;
    }
}
