package com.pluralsight;

import com.pluralsight.orderedService.Chips;
import com.pluralsight.orderedService.Drink;
import com.pluralsight.orderedService.Sandwich;

import java.util.Scanner;

public class OrderMenu {
    private final Order order;
    private final Scanner scanner = new Scanner(System.in);

    public OrderMenu(Order order) {
        this.order = order;
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

    private void addDrink() {
        DrinkBuilding drinkBuilder = new DrinkBuilding();
        Drink drink = drinkBuilder.buildingDrink();
        order.addDrink(drink);
        System.out.println("Drink Added.");
    }

    private void addChips() {
        Chips chips = new Chips();
        order.addChips(chips);
        System.out.println("Chips Added.");
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