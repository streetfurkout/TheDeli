package com.pluralsight;

import java.util.Scanner;

public class DrinkBuilder {
    private final Scanner scanner = new Scanner(System.in);

    public Drink buildDrink() {
        System.out.println("\n--- Drink Building ---");
        System.out.print("Size (Small/Medium/Large): ");
        String size = scanner.nextLine();
        return new Drink(size);
    }
}