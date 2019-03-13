package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        // Using if it runs one time
//        double rad = in.nextFloat();
//        if (rad<0) {
//            System.out.println("Radius can not be negative.");
//        } else {
//            double pi = 3.14;
//            double area = pi * rad * rad;
//
//            System.out.println("The area of a circle of radius " + rad + " is: " + area);
//        }

        // Using while
        double rad = in.nextFloat();
        while (rad<0)
            rad = in.nextFloat();
        double pi = 3.14;
        double area = pi * rad * rad;
        System.out.println("The area of a circle of radius " + rad + " is: " + area);

        // Using do while
//        double rad;
//        do {
//            rad = in.nextFloat();
//            if (rad < 0) System.out.println("Radius must be greater than 0: ");
//        } while(rad<0);
//        double pi = 3.14;
//        double area = pi * rad * rad;
//        System.out.println("The area of a circle of radius " + rad + " is: " + area);

    }
}
