package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = myScanner.next();

        System.out.println("How many hours did you work? ");
        float num1 = myScanner.nextFloat();

        System.out.println("Please enter your pay rate: ");
        float num2 = myScanner.nextFloat();

        float gross = num1 * num2;

        System.out.printf("Employee: %s\nEarned a gross pay of $%.2f\n", name, gross);



    }
}
