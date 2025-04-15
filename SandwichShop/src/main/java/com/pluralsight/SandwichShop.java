package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What size sandwich would you like? (1) Regular or (2) Large? ");
        byte size = myScanner.nextByte();

        float basePrice = (size == 1) ? 5.45f : 8.95f;

        System.out.print("Would you like a loaded sandwich? (Y) yes or (N) no ");
        char loaded = Character.toUpperCase(myScanner.next().charAt(0));

        float loadedPrice;
        if (loaded == 'Y' && size == 1) {
            loadedPrice = 1.00f;
        }
        else if (loaded == 'Y' && size == 2) {
            loadedPrice = 1.75f;
        }
        else{
            loadedPrice = 0.00f;
        }

        System.out.print("What is your age? ");
        byte age = myScanner.nextByte();

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

        float totalPrice = price + loadedPrice;
        System.out.printf("\nThe total cost of your sandwich will be: $%.2f", totalPrice);
    }
}