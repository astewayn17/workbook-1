package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = myScanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = myScanner.nextInt();

        System.out.println("Possible calculations: \n" +
                "   (A)dd \n" +
                "   (S)ubtract \n" +
                "   (M)ultiply \n" +
                "   (D)ivide \n");

        System.out.println("Please select an option: ");
        char M = myScanner.next().charAt(0);

        int product = num1 * num2;

        System.out.println(num1 +" * "+ num2 +" = "+ product);
    }
}
