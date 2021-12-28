package exercises;

import java.util.Scanner;

public class GasConsumed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gas;
        double miles;

        System.out.println("Please enter the number of miles traveled:");
        miles = input.nextDouble();
        System.out.println("Please enter the amount of gallons of gas consumed:");
        gas = input.nextDouble();
        input.close();

        double milesPerGallon = miles / gas;
        System.out.println("Your miles per gallon is: " + milesPerGallon);
    }
}
