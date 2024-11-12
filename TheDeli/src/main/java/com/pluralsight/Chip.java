package com.pluralsight;

public class Chip {
    private final double price = 1.50;

    public double getPrice() {
        return price;

        @Override
        public String toString () {
            return "Chips ($" + price + ")";
        }
    }
}
