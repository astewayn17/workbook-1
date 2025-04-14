package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = myScanner.next();

        System.out.print("How many hours did you work? ");
        float hours = myScanner.nextFloat();

        System.out.print("Please enter your pay rate: ");
        float rate = myScanner.nextFloat();

        float gross;

        if (hours > 40) {
            float otHours = hours - 40;
            gross = (40 * rate) + (otHours * rate * 1.5f);
        }
        else {
            gross = hours * rate;
        }

        System.out.println("--------------------------------");

        System.out.printf("Employee: %s\nEarned a gross pay of: $%.2f\n", name, gross);
    }
}
