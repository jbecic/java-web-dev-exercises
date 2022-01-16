package org.launchcode.java.studios.restaurantMenu;
import java.time.LocalDate;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String description;
    private boolean isNew;
    private LocalDate update;

    public MenuItem(String name, double price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.update = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return name + ": " + "price = " + price + ", category = " + category + ", description = " + description + ", isNew = " + isNew + ", last update = " + update;
    }

    public void print() {
        System.out.println(this);
    }
}
