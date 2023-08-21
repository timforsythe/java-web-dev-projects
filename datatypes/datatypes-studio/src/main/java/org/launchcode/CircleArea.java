package org.launchcode;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in meters:");
        Double radius = input.nextDouble();

        Double area = Circle.getArea(radius);
        //Double area = 3.14 * (radius * radius);
        System.out.println("The area of the circle is " + area + " square meters.");
    }
}
