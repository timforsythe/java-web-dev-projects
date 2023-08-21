package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle in meters:");
        Float length = input.nextFloat();

        System.out.println("Enter the width of the rectangle in meters:");
        Float width = input.nextFloat();

        Float area = (length * width);
        System.out.println("The area of the rectangle is " + area + " square meters.");
    }
}
