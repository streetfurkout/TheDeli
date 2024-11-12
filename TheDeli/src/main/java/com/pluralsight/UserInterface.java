package com.pluralsight;

import com.pluralsight.orderedService.Drink;

import java.util.Scanner;

public class UserInterface {


    Scanner scanner = new Scanner(System.in);
    public Drink addDrink() {

        System.out.println("\n--- Drink Building ---");
        System.out.print("Size (Small/Medium/Large): ");
        String size = scanner.nextLine();
        System.out.println("Please select a flavour.");
        System.out.println("1- Diet Coke \n" +
                "2- Fanta \n" +
                "3- Sprite \n" +
                "4- Water \n" +
                "5- Sparkling Water");
        String flavour = scanner.nextLine();
        String selection = null;
        switch (flavour) {
            case "1":
                selection = "Diet Coke";
                break;
            case "2":
                selection = "Fanta";
                break;
            case "3":
                selection = "Sprite";
                break;
            case "4":
                selection = "Water";
                break;
            case "5":
                selection = "Mineral Water";
                break;
            default:
                System.out.println("Invalid Option!");

        }
        return new Drink(size, selection);
    }
}