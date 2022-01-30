package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;

        System.out.println("Please enter the length:");
        length = input.nextDouble();
        System.out.println("Please enter the width:");
        width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
