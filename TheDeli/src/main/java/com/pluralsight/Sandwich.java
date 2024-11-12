package com.pluralsight;

import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private boolean toasted;
    private List<Topping> toppings;

    public Sandwich(String size, String breadType, boolean toasted, List<Topping> toppings) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = toppings;
    }
    public double calculatePrice() {
        double basePrice = 0;

        if (size.equals("4")) {
            basePrice = 5.50;
        } else if (size.equals("8")) {
            basePrice = 7.00;
        } else if (size.equals("12")) {
            basePrice = 8.50;
        }

        double toppingsCost = 0;
        for (Topping topping : toppings) {
            toppingsCost += topping.getPrice();
        }

        return basePrice + toppingsCost;
    }