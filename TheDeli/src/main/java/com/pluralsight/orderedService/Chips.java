package com.pluralsight.orderedService;

public class Chips implements ICalculatePrice {
    private String flavour;

    public Chips(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public double calculatePrice() {
        return 1.5;
    }
}
