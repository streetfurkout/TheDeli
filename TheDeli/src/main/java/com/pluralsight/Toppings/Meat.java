package com.pluralsight.Toppings;

public class Meat extends Topping {
    public Meat(String type) {
        super(type);
    } // Constructor passes type to the parent class (Topping)

    @Override
    public double getPrice(String size) {
        // Calculate the price based on sandwich size.
        return 1 * (Integer.parseInt(size) / 4);
    }


}
