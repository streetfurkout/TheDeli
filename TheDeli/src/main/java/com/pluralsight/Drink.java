package com.pluralsight;

public class Drink {
    private String size;
    private double price;

    public Drink(String size) {
        this.size = size;
        if(size.equalsIgnoreCase("small")) {this.price = 2.00;}
        else if (size.equalsIgnoreCase("medium")){this.price=2.50;}
        else if (size.equalsIgnoreCase("large")) {this.price=3.00;}
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return size + " drink ($" + price + ")";
    }
}
