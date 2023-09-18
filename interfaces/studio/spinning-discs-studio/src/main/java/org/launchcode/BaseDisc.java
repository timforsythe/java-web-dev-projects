package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int capacityUsed, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = (storageCapacity - capacityUsed);
        this.capacityUsed = capacityUsed;
        this.discType = discType;
    }

   /* private int checkCapacity(int dataUsed) {
        if (storageCapacity < dataUsed) {
            return storageCapacity;
        }
        return dataUsed;
    }

    private int capacityLeft() {
        return storageCapacity - capacityUsed;
    }*/

    public String getInfo() {
        String output = String.format("\nDisk name: %s\nCapacity: %d MB" +
                "\nSpace used: %d MB" +
                "\nAvailable: %d MB\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize){
        if (dataSize > remainingCapacity){
            return "Data write failed. Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity + " MB.";
    }


}
