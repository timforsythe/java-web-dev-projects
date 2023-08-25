package org.launchcode;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in meters:");
        String radius = input.next();
        while (!Circle.validateInput(radius))
        {
            System.out.println("Invalid input\n Type a double-type number:");
            radius = input.next();
        }
    double verifyRadius = Double.parseDouble(radius);
        Double area = Circle.getArea(verifyRadius);
        //Double area = 3.14 * (radius * radius);
        System.out.println("The area of the circle is " + area + " square meters.");
    }
}
