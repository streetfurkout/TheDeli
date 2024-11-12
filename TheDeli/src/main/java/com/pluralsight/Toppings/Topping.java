package com.pluralsight.Toppings;

public abstract class Topping {
    private String type;


    public Topping(String type) {
        this.type = type;

    }

    public abstract double getPrice();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type='" + type + '\'' +
                '}';
    }
}