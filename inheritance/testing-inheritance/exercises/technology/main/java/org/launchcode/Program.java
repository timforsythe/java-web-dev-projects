package org.launchcode;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(800,8,true,4.0);
        SmartPhone myPhone = new SmartPhone(32,4,false,365);

        System.out.println("Laptop ID: " + myLaptop.getId());
        System.out.println("Smartphone ID: " + myPhone.getId());

        if (myLaptop.isClunky()) {
            System.out.println("My laptop is so heavy!");
        }
        else {
            System.out.println("My laptop is so light!");
        }

        myPhone.takeSelfie();

        System.out.println("I just took a selfie! I now have " + myPhone.getNumberOfSelfies() + " selfies on my phone!");
    }

}
