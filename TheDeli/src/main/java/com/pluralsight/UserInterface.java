package com.pluralsight;

import com.pluralsight.orderedService.Chips;
import com.pluralsight.orderedService.Drink;
import com.pluralsight.orderedService.Sandwich;

import java.util.Scanner;

public class UserInterface {
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(Order order) {
        this.order = order;
    }


    public void homeScreen(){
    boolean running = true; {
        while (running)
        System.out.println("---- DELI Order Menu Screen----");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.print("Your Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            displayOrderMenu();
        } else if (choice == 0) {
            System.out.println("Program Ending...");
            running = false;
        } else {
            System.out.println("Invalid Option!! Please Try Again.");
        }
    }
    }

    public void displayOrderMenu() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n--- Order Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Your Order: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addSandwich();
            } else if (choice == 2) {
                addDrink();
            } else if (choice == 3) {
                addChips();
            } else if (choice == 4) {
                checkout();
                ordering = false;
            } else if (choice == 0) {
                System.out.println("Order Created.");
                ordering = false;
            } else {
                System.out.println("Invalid Option!! Please Try Again.");
            }
        }
    }

    private void addSandwich() {
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        Sandwich sandwich = sandwichBuilder.buildSandwich();
        order.addSandwich(sandwich);
        System.out.println("Sandwich Added.");
    }

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

    private void addChips() {

        System.out.println("Please select a flavour.");
        System.out.println("1- Salty Pepper \n" +
                "2- Ranch Doritos \n");
        String flavour = scanner.nextLine();
        String selection = null;
        switch (flavour) {
            case "1":
                selection = "Salty Pepper";
                break;
            case "2":
                selection = "Ranch Doritos";
                break;
            default:
                System.out.println("Invalid Option!");

        }   order.addChips(new Chips(selection));

    }

    private void checkout() {
        System.out.println("\n--- Your Order ---");
        System.out.println(order);
        System.out.println("Total Amount: $" + order.calculateTotal());

        // Save the order to a receipt file
        Receipt.saveOrder(order);
        System.out.println("Order Created and Receipt Saved.");
    }
}