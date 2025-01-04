package com.example;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continueCalculating = "yes";

        while (continueCalculating.equalsIgnoreCase("yes")) {
            try {
                System.out.print("Enter first number: ");
                String input1 = scanner.nextLine();
                if (!InputValidator.isValidNumber(input1)) {
                    throw new InvalidInputException("Invalid number: " + input1);
                }
                double num1 = Double.parseDouble(input1);

                System.out.print("Enter an operation (+, -, *, /): ");
                String operation = scanner.nextLine();
                if (!InputValidator.isValidOperation(operation)) {
                    throw new InvalidInputException("Invalid operation: " + operation);
                }

                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                if (!InputValidator.isValidNumber(input2)) {
                    throw new InvalidInputException("Invalid number: " + input2);
                }
                double num2 = Double.parseDouble(input2);

                double result = 0;
                switch (operation) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        try {
                            result = calculator.divide(num1, num2);
                        } catch (ArithmeticException e) {
                            LoggingUtils.logError("Error in division", e);
                            System.out.println("Error: " + e.getMessage());
                            continue;
                        }
                        break;
                }

                System.out.println("Result: " + result);
            } catch (InvalidInputException e) {
                LoggingUtils.logError("Invalid input encountered", e);
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                LoggingUtils.logError("An unexpected error occurred", e);
                System.out.println("An unexpected error occurred.");
            }

            System.out.print("Do you want to calculate again? (yes/no): ");
            continueCalculating = scanner.nextLine();
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
