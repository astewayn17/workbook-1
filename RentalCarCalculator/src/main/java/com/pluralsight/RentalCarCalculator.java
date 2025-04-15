package com.pluralsight;
// Importing the scanner
import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        // Initializing the scanner
        Scanner myScanner = new Scanner(System.in);

        // Where all the questions will be asked in input format
        System.out.print("What day would you like to pick up? ");
        String pickupDate = myScanner.next();
        System.out.print("How many days would you like to rent? ");
        int rentalDays = myScanner.nextInt();
        System.out.print("Would you like an electronic toll tag at $3.95/day?\nYes (y) or No (n): ");
        boolean tollTag = myScanner.next().equalsIgnoreCase("y");
        System.out.print("Would you like a GPS at $2.95/day?\nYes (y) or No (n): ");
        boolean GPS = myScanner.next().equalsIgnoreCase("y");
        System.out.print("Would you like roadside assistance at $3.95/day?\nYes (y) or No (n): ");
        boolean roadside = myScanner.next().equalsIgnoreCase("y");
        System.out.print("Please enter your age: ");
        int age = myScanner.nextInt();

        // Defined the variables using the static methods and further calculations
        double basicCarRentalFee = calcStandardRental(rentalDays);
        double tollCost = costWithToll(rentalDays, tollTag);
        double gpsCost = costWithGPS(rentalDays, GPS);
        double roadsideCost = costWithRoadside(rentalDays, roadside);
        double underageCost = costUnderageFee(age, basicCarRentalFee);
        double optionsCost = tollCost + gpsCost + roadsideCost;
        double totalCost = basicCarRentalFee + optionsCost + underageCost;

        // Separates the questions from the output
        System.out.println("-----------------------------------");

        // Prints out the data from the variables above
        System.out.println("Date of Pickup: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f\n", basicCarRentalFee);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf(" - Toll Tag Fee: $%.2f\n", tollCost);
        System.out.printf(" - GPS Fee: $%.2f\n", gpsCost);
        System.out.printf(" - Roadside Assistance Fee: $%.2f\n", roadsideCost);
        System.out.printf("Underage Driver Surcharge: $%.2f\n", underageCost);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

    }   // Using static methods to calculate and define the variable above
    public static double calcStandardRental(int rentalDays) {
        return rentalDays * 29.99;
    }
    public static double costWithToll(int rentalDays, boolean tollTag) {
        return tollTag ? 3.95 * rentalDays : 0;
    }
    public static double costWithGPS(int rentalDays, boolean GPS) {
        return GPS ? 2.95 * rentalDays : 0;
    }
    public static double costWithRoadside(int rentalDays, boolean roadside) {
        return roadside ? 3.95 * rentalDays : 0;
    }
    public static double costUnderageFee(int age, double basicCarRentalFee) {
        return (age < 25) ? basicCarRentalFee * 0.30 : 0;
    }
}


