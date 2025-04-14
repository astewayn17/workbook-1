package com.pluralsight;

public class MathApp {

    //This is the main method and where my code will run from
    //All code I am typing for this exercise will be in this method
    public static void main(String[] args) {

        /*
        Create two variables to represent the salary for Bob and Gary, name them
        bobSalary and garySalary. Create a new variable named
        highestSalary. Determine whose salary is greater using Math.max() and
        store the answer in highestSalary.  Set the initial salary variables to any value
        you want. Print the answer (i.e "The highest salary is …")
         */

        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        System.out.println("-----------------------------------------");

        /*
        Find and display the smallest of two variables named carPrice and
        truckPrice.  Set the variables to any value you want.
         */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest price is $" + Math.min(carPrice, truckPrice));

        System.out.println("-----------------------------------------");

        //Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double areaCircle = Math.PI * (Math.pow(radius, 2));

        System.out.println("The area of the circle with a radius of " + radius + " is: " + areaCircle);

        System.out.println("-----------------------------------------");

        //Find and display the square root a variable after it is set to 5.0

        float x = 5.0f;

        System.out.println("The square root is " + Math.sqrt(x));

        System.out.println("-----------------------------------------");

        //Find and display the distance between the points (5, 10) and (85, 50)

        byte x1 = 5;
        byte x2 = 85;
        byte y1 = 10;
        byte y2 = 50;

        double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("The distance is: " + d);

        System.out.println("-----------------------------------------");

        // Find and display the absolute (positive) value of a variable after it is set to -3.8

        double z = -3.8;
        double absValue = Math.abs(z);

        System.out.println("The absolute value of " + z + " is: " + absValue);

        System.out.println("-----------------------------------------");

        // Find and display a random number between 0 and 1

        System.out.println("A random number between 0 and 1 is: " + Math.random());

    }
}
