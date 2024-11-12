package com.pluralsight;

public class Cheese extends Topping {
    public Cheese(String type) {
        super(type);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
