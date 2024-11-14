package com.pluralsight.Toppings;

public class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name);
    } // Constructor passes name to the parent class (Topping)

    @Override
    // Regular toppings are free in this implementation
    public double getPrice(String size) {
        return 0;
    }
}