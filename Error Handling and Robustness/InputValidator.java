public package com.example;

public class InputValidator {

    // Validates if the input is a valid number
    public static boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validates operation input
    public static boolean isValidOperation(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }
}
 {
    
}
