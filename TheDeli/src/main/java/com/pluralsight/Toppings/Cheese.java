package com.pluralsight.Toppings;

import com.pluralsight.Toppings.Topping;

public class Cheese extends Topping {
    public Cheese(String type) {
        super(type);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
