package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        ArrayList<String> unsortedFlavors = new ArrayList<>();
        ArrayList<String> unsortedCones = new ArrayList<>();
        ArrayList<String> sortedFlavors = new ArrayList<>();
        ArrayList<String> sortedCones = new ArrayList<>();

        //System.out.println("Flavors Before:" + "\n");
        for (Flavor f: flavors) {
            unsortedFlavors.add(f.getName());
            //System.out.println(f.getName());
        }

        //System.out.println("Cones Before:" + "\n");
        for (Cone c: cones) {
            unsortedCones.add(c.getName() + ": " + c.getCost());
            //System.out.println(c.getName() + ": " + c.getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        //System.out.println("Flavors After:" + "\n");
        for (Flavor f: flavors) {
            sortedFlavors.add(f.getName());
            //System.out.println(f.getName());
        }

        //System.out.println("Cones After:" + "\n");
        for (Cone c: cones) {
            sortedCones.add(c.getName() + ": " + c.getCost());
            //System.out.println(c.getName() + ": " + c.getCost());
        }

        System.out.println("Before Flavors:" + "     " + "After Flavors:");
        for (int i = 0; i < unsortedFlavors.size(); i++) {
            System.out.println(unsortedFlavors.get(i) + "     " + sortedFlavors.get(i));
        }

        System.out.println("Before Cones:" + "     " + "After Cones:");
        for (int i = 0; i < unsortedCones.size(); i++) {
            System.out.println(unsortedCones.get(i) + "     " + sortedCones.get(i));
        }
    }
}
