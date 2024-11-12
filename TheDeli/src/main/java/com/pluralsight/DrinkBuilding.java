package com.pluralsight;

import com.pluralsight.orderedService.Drink;

import java.util.Scanner;

public class DrinkBuilding {
    private final Scanner scanner = new Scanner(System.in);

    public Drink buildingDrink() {
        System.out.println("\n--- Drink Building ---");
        System.out.print("Size (Small/Medium/Large): ");
        String size = scanner.nextLine();
        return new Drink(size);
    }
}