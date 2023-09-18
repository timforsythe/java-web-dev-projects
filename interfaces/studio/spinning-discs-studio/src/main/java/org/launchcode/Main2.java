package org.launchcode;

public class Main2 {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCd = new CD("My CD", 700, 300, "CD");
        DVD myDvd = new DVD("My DVD", 4700, 2400, "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.readData();
        myDvd.readData();

        System.out.println(myCd.getInfo());
        System.out.println(myDvd.getInfo());

        System.out.println("My CD: " + myCd.writeData(500));
        System.out.println("My DVD: " + myDvd.writeData(400));
    }

}