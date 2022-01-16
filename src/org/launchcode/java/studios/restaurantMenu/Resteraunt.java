package org.launchcode.java.studios.restaurantMenu;
import java.util.*;

public class Resteraunt {
    public static void main(String[] args) {
        MenuItem ribeye = new MenuItem("Ribeye", 32.44, "Entree", "Cut from the roast and cooked to your desire.");
        MenuItem salad = new MenuItem("Caesar Salad", 5.72, "Side", "Pleanty of greens!");
        MenuItem poppers = new MenuItem("Jalapeno Poppers", 8.00, "Apitizer", "Jalapeno peppers stuffed with cream cheese and fried.");
        MenuItem ketchup = new MenuItem("Ketchup", 0.99, "Condiment", "Table condiment with a sweet and tangy flavor.");

        Menu menu = new Menu();
        menu.addMenuItem(ribeye);
        menu.addMenuItem(salad);
        menu.addMenuItem(poppers);
        menu.addMenuItem(ketchup);
        menu.addMenuItem(ketchup);
        menu.addMenuItem(ribeye);
        ribeye.setIsNew(true);
        salad.setIsNew(true);
        poppers.setIsNew(true);

        menu.print();
        salad.print();
        menu.removeMenuItem(ribeye);
        menu.print();
    }
}
