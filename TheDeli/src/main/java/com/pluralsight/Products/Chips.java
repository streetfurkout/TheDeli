package com.pluralsight.Products;

public class Chips implements ICalculatePrice {
    private String flavour;

    public Chips(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public double calculatePrice() {
        return 1.5;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "flavour='" + flavour + '\'' +
                '}';
    }
}
