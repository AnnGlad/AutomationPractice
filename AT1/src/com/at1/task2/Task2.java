package com.at1.task2;

import java.util.Scanner;

public class Task2 {

    public static void execute() {

        System.out.println("Task2. The user enters the number of lines, then the values of these lines. The program calculates the average length of lines and displays on the screen.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in number of lines (use integers, > 0):");
        int numOfLines = scan.nextInt();
        double sumOfLines = 0;
        double averageLength = 0;
        if (numOfLines > 0) {
            for (int i = 0; i < numOfLines; i++) {
                System.out.println("Type in your" + (i + 1) + " line");
                String line = scan.next();
                int lineLength = line.length();
                sumOfLines += lineLength;
            }
            averageLength = sumOfLines / numOfLines;
            System.out.println("Average length of lines is: " + averageLength);
        } else {
            System.out.println("Please enter number of lines more than 0");
        }

    }

}

