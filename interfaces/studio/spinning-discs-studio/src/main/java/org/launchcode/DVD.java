package org.launchcode;

// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity, int capacityUsed, String discType) {
        super(name, storageCapacity, capacityUsed, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVDs hold seven times more information and spin three times faster than a CD. The rotational speed, or angular velocity, of a DVD goes between 570-1600 rpm (rotations per minute).");
    }

    @Override
    public void readData() {
        System.out.println("The DVD is running.");
    }

}
