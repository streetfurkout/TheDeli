package com.pluralsight.Toppings;

public class Meat extends Topping {
    public Meat(String type) {
        super(type);
    }

    @Override
    public double getPrice(String size) {
        return 1 * (Integer.parseInt(size) / 4);
    }


}
