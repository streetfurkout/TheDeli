package com.pluralsight.Toppings;

public abstract class Topping {
    private String type;


    public Topping(String type) {
        this.type = type;

    }

// Abstract method to get the price of the topping based on the sandwich size.
    public abstract double getPrice(String size);

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type='" + type + '\'' +
                '}';
    }
}