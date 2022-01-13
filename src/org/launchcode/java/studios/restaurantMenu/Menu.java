package org.launchcode.java.studios.restaurantMenu;
import java.util.*;

public class Menu {
    private ArrayList<Object> menuItems = new ArrayList<>();
    private Date lastUpdated;


    public ArrayList<Object> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Object> aMenuItems) {
        menuItems = aMenuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    @Override
    public String toString() {
        return "{" + "menuItems = " + menuItems + "}";
    }

    public void addMenuItem (Object menuItem) {
        if (!menuItems.contains(menuItem)) {
            this.menuItems.add(menuItem);
            this.lastUpdated = new Date();
        } else {
            System.out.println("This is already on the menu.");
        }
    }

    public void removeMenuItem (Object menuItem) {
        menuItems.remove(menuItem);
    }

    public void print () {
        for (Object menuItem : menuItems) {
            System.out.println(menuItem + "\n");
        }
    }
}
