package com.at1.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void Execute() {

        System.out.println("Task1");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in array length (How many numbers do you want in your array?)");
        int arrLength = userInput.nextInt();
        String noNegativesMsg = "Your array does not have negative values";
        if (arrLength > 0) {
            int[] array = new int[arrLength];
            System.out.println("Please specify min number");
            int min = userInput.nextInt();
            System.out.println("Please specify max number");
            int max = userInput.nextInt();
            System.out.println("Generating array with random numbers...");
            for (int i = 0; i < array.length; i++) {
                int random = (int) ((Math.random() * (max - min)) + min);
                array[i] = random;
            }
            System.out.println("Here is your array: " + Arrays.toString(array));
            if (min < 0) {
                boolean isLesser = false;
                //Checking for values less than 0
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        isLesser = true;
                        break;
                    }
                }
                if (isLesser == true) {
                    System.out.println("Changing negative values in the array to 0...");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < 0) {
                            array[i] = 0;
                        }
                    }
                    System.out.println("Here is the changed array: " + Arrays.toString(array));
                } else {
                    System.out.println(noNegativesMsg);
                }
            } else {
                System.out.println(noNegativesMsg);
            }
        } else if (arrLength < 0) {
            System.err.println("The array length can't be negative");
        } else {
            System.err.println("Array can't be empty");
        }

    }
}
