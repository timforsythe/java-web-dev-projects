package org.launchcode;
public class Main extends HouseCat{

    public Main() {
    }

    HouseCat garfield = new HouseCat("Garfield", 12);
    garfield.eat();
    System.out.println(garfield.isTired());   // prints true

    HouseCat spike = new HouseCat("Spike");
    System.out.println(spike.getWeight()); // prints 13


}


