package com.pluralsight;

import com.pluralsight.orderedService.Chips;
import com.pluralsight.orderedService.Drink;
import com.pluralsight.orderedService.Sandwich;

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

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
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



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:\n");

        for (Sandwich sandwich : sandwiches) {
            sb.append(sandwich.toString()).append("\n");
        }
        for (Drink drink : drinks) {
            sb.append(drink.toString()).append("\n");
        }
        for (Chips chip : chips) {
            sb.append(chip.toString()).append("\n");
        }

        return sb.toString();
    }
}