package org.launchcode;

public class Computer extends AbstractEntity {

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

}
