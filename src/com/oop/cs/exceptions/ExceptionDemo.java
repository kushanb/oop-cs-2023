package com.oop.cs.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
//            System.out.print("Enter a number: ");
//            int num = scanner.nextInt();
//
//            System.out.print("Enter the denominator: ");
//            int den = scanner.nextInt();
//
//            int dividedNum = num / den;

//            System.out.println("Divided value is: " + dividedNum);
//            testException(2000);

            int num = scanner.nextInt();
            if (num > 1000) {
                throw new InputMismatchException("Large number");
            } else if (num < 0) {
                throw new Exception("Negative input");
            }


        } catch (InputMismatchException exception) {
            System.out.println("An error has occurred: Input should be an Integer!" + exception.getMessage());
//            exception.printStackTrace();
        } catch (ArithmeticException exception) {
            System.out.println("An error has occurred: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("An error has occurred:\n" + exception.getMessage());
        } finally {
            System.out.println("End of code block!");
        }
    }

    private static void testException(int number) throws Exception {
        if (number > 1000) {
            throw new InputMismatchException("The number was greater than 1000!");
        } else if(number < 0) {
            throw new Exception("Number was not positive!");
        }
    }
}
