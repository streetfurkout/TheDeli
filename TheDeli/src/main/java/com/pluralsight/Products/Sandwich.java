package com.pluralsight.Products;

import com.pluralsight.Toppings.Topping;

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
            toppingsCost += topping.getPrice(size);
        }

        return basePrice + toppingsCost;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" inch ").append(breadType).append(" sandwich");
        if (toasted) sb.append(" (toasted)");
        sb.append(" with toppings: ");
        for (Topping topping : toppings) {
            sb.append(topping.getType()).append(", ");
        }
        return sb.toString();
    }
}