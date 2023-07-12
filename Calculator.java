package com.alka;
import java.util.Scanner;
//import java.math.BigInteger;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1 for +");
        System.out.println("2 for *");
        System.out.println("3 for -");
        System.out.println("4 for /");
        System.out.println("5 for %");
        System.out.println("6 for exit the code");

        Scanner scan = new Scanner(System.in);


        if (!scan.hasNextInt()) {
            System.out.println("Invalid input. Integer expected.");
            return;  // End the code execution
        }

        boolean exit = false;


        while (!exit) {

            int operator = scan.nextInt();
            if (operator == 0) {
                System.out.println("Invalid input. Operator should be between 1 and 6.");
                return;
            }
            if (operator > 6) {
                System.out.println("Invalid input. Operator should be between 1 and 6.");
                return;  // End the code execution
            }

            if (operator == 6) {
                System.out.println("Thank you");
                return;
            }


            System.out.println("Enter first number");
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Integer expected.");
                return;  // End the code execution
            }
            int a = scan.nextInt();

            System.out.println("Enter second number");
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Integer expected.");
                return;  // End the code execution
            }
            int b = scan.nextInt();

            if (operator == 4 && b == 0) {
                System.out.println("Error: Division by zero.");
                continue; // Ask for input again
            }

            int result;
            switch (operator) {
                case 0:
                    exit = true; // Set exit flag to true to exit the loop
                    break;
                case 1:  // add
                    result = a + b;
                    System.out.println("Your result is " + result);
                    System.out.println("Enter your operator again:");
                    break;
                case 2:  // multiplication
                    result = a * b;
                    System.out.println("Your result is " + result);
                    System.out.println("Enter your operator again:");
                    break;
                case 3:  // subtraction
                    result = a - b;
                    System.out.println("Your result is " + result);
                    System.out.println("Enter your operator again:");
                    break;
                case 4:  // division
                    result = a / b;
                    System.out.println("Your result is " + result);
                    System.out.println("Enter your operator again:");
                    break;

                //Modulus
                case 5:
                    result = a % b;
                    System.out.println("Your result is " + result);
                    System.out.println("Enter your operator again:");
                    break;
                case 6:
                    System.out.println("Thank you");
                    return;
            }
        }

    }
}

