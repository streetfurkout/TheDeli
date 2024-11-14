package com.pluralsight.Toppings;


public class Cheese extends Topping {
    public Cheese(String type) {
        super(type);
    }

    @Override
    public double getPrice(String size) {
        return .75 * (Integer.parseInt(size) / 4);
    }
}
