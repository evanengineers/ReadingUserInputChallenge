package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner to receive input
        int count = 1;
        int sum = 0;

        while (count < 11) {
            System.out.println("Enter #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                System.out.println("number " + count + " was " + number);
                sum+= number;
                count++;
            }else {
                System.out.println("Invalid Number");
                System.out.println("Please enter a valid number");
            }
            scanner.nextLine();//handle end of line enter key to avoid an endless loop
        }
        System.out.println("Sum of numbers is " + sum);
        scanner.close();
    }
}
