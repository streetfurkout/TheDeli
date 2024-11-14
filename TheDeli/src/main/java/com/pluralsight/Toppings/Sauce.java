package com.pluralsight.Toppings;

public class Sauce extends Topping {

    public Sauce(String type) {
        super(type);
    }  // Constructor passes type to the parent class (Topping)

    @Override
    public double getPrice(String size) {
        return 0;
    }       // Sauces are free in this implementation
}
