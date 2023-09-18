package org.launchcode;

// TODO: Implement your custom interface.
public class CD extends BaseDisc implements OpticalDisc {


    public CD(String name, int storageCapacity, int capacityUsed, String discType) {
        super(name, storageCapacity, capacityUsed, discType);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("CDs spin at about 500 rpm when read near the center, decreasing to approximately 200 rpm when read near the circumference, producing a constant linear velocity.");
    }

    @Override
    public void readData() {
        System.out.println("The CD is running.");
    }

}
