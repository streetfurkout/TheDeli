package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
    }

    public double calculateTotal() {
        double sandwichTotal = 0;
        for (Sandwich sandwich : sandwiches) {
            sandwichTotal += sandwich.calculatePrice();
        }

        double drinkTotal = 0;
        for (Drink drink : drinks) {
            drinkTotal += drink.getPrice();
        }

        double chipsTotal = chips.size() * 1.50;

        return sandwichTotal + drinkTotal + chipsTotal;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                '}';
    }
}