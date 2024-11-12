package com.pluralsight;

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
            System.out.println("\n--- Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add drink");
            System.out.println("3) Add chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel the order");
            System.out.print("Your choice is: ");
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
                System.out.println("Order Canceled.");
                ordering = false;
            } else {
                System.out.println("Invalid.");
            }
        }
    }