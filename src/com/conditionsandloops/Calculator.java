package com.conditionsandloops;

import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Basic Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = in.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = in.nextDouble();

                double result = switch (choice) {
                    case 1 -> num1 + num2;
                    case 2 -> num1 - num2;
                    case 3 -> num1 * num2;
                    case 4 -> num1 / num2;
                    default -> 0;
                };

                System.out.println("Result: " + result);
            } else if (choice == 5) {
                continueCalculation = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Calculator closed.");
        in.close();
    }
}
