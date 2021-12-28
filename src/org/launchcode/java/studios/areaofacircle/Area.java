package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        double radius = 0;

        while (!(radius > 0)) {
            System.out.println("Enter a radius:");
            userInput = input.nextLine();

            try {
                radius = Double.parseDouble(userInput);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
                radius = 0;
            }

            if (radius < 0) {
                System.out.println("Please use a positive number.");
                radius = 0;
            }

        }

        input.close();

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
