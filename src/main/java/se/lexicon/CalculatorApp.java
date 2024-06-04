package se.lexicon;

import java.util.Scanner;

public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        performCalculation();
    }

    public static void performCalculation() {

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter a operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println("Result: " + result);

        System.out.println("Do you want to do another calculation? (yes/no)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            performCalculation();
        } else {
            System.out.println("Calculator program ended.");
        }
    }
}
