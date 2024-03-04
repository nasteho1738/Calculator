package com.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println(" Enter the Second number:");
            double num2 = scanner.nextDouble();
            System.out.println("choose an operation(+, -, *, /):");
            char operation = scanner.next().charAt(0);
            double result;
            switch (operation) {
                case'+':
                    result = num1 + num2;
                    break;
                case'-':
                    result = num1 - num2;
                    break;
                case'*':
                    result = num1 * num2;
                    break;
                case'/':
                    if (num2 == 0) {
                        System.out.println("Error: Invalid Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    continue;
            }
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation?(y/n)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("n")) {
                continueCalculating = false;
            }
        }

        System.out.println("Goodbye!");
    }
}
