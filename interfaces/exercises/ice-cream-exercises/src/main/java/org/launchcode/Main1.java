package org.launchcode;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //Comparator comparator = new FlavorComparator();

        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}