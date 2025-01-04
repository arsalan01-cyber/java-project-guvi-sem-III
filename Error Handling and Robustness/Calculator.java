public package com.example;

public class Calculator {

    // Performs addition
    public double add(double a, double b) {
        return a + b;
    }

    // Performs subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Performs multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Performs division with error handling
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
 {
    
}
