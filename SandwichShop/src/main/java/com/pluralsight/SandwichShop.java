package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What size sandwich would you like? (1) Regular or (2) Large? ");
        byte size = myScanner.nextByte();

        float basePrice = (size == 1) ? 5.45f : 8.95f;

        System.out.print("What is your age? ");
        int age = myScanner.nextByte();

        float price;
        if (age <= 17) {
            price = basePrice * .9f;
        }
        else if (age >= 65) {
            price = basePrice * .8f;
        }
        else {
            price = basePrice;
        }
        System.out.printf("The total cost of your sandwich will be: $%.2f", price);
    }
}