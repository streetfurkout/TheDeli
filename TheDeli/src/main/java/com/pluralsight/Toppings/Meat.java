package com.pluralsight.Toppings;

public class Meat extends Topping {
    public Meat(String type) {
        super(type);
    }

    @Override
    public double getPrice() {
        return 0;
    }


}