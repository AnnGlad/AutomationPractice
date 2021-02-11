package com.at1.task3;

import java.util.Scanner;

public class Task3 {

    public static void Execute() {
        System.out.println("Task3");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type in 1st numeric value and hit Enter:");
        double val1 = userInput.nextDouble();
        System.out.println("Type in 2nd numeric value and hit Enter:");
        double val2 = userInput.nextDouble();
        System.out.println("Chose operation: +, -, /,*, % ");
        double result = 0;
        char opCode = userInput.next().charAt(0);
        switch (opCode) {
            case '+':
                result = val1 + val2;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = val1 - val2;
                System.out.println("Subtraction: " + result);
                break;
            case '/':
                if (val2 != 0) {
                    result = val1 / val2;
                    System.out.println("Division: " + result);
                } else {
                    System.err.println("Division by 0 is forbidden");
                }
                break;
            case '*':
                result = val1 * val2;
                System.out.println("Multiplication: " + result);
                break;
            case '%':
                result = (int) (val1 % val2);
                System.out.println("Modulo: " + result);
                break;
            default:
                System.err.println("Invalid operation code. Please use only +, -, /, *, %");
                result = 0;
                break;

        }
    }

}
