package com.pluralsight.Toppings;

public class Sauce extends Topping {

    public Sauce(String type) {
        super(type);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
