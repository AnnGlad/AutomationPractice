package com.at1.task2;

import java.util.Scanner;

public class Task2 {

    public static void Execute() {
        System.out.println("Task2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in number of lines (use integers, > 0):");
        int quantity = scan.nextInt();
        double sumOfLines = 0;
        double averageLength = 0;
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                System.out.println("Type in length for the " + (i + 1) + " line");
                double line = scan.nextDouble();
                sumOfLines += line;
            }
            averageLength = sumOfLines / quantity;
            System.out.println("Average length of lines is: " + averageLength);
        } else {
            System.out.println("Please enter number of lines more than 0");
        }
    }

}

