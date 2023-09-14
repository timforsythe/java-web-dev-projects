package org.launchcode;

public class Mane {
    public static void main(String[] args) {
        Cars car = new Cars("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}