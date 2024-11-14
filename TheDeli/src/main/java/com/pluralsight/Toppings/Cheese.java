package com.pluralsight.Toppings;


public class Cheese extends Topping {
    public Cheese(String type) {
        super(type);
    }   // Constructor passes type to the parent class (Topping)

    @Override
    public double getPrice(String size) {
        // Calculate the price based on sandwich size
        return .75 * (Integer.parseInt(size) / 4);
    }
}
