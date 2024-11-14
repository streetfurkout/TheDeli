package com.pluralsight;

import com.pluralsight.Order.Order;
import com.pluralsight.Order.Receipt;
import com.pluralsight.Order.OrderService;
import com.pluralsight.Products.Chips;
import com.pluralsight.Products.Drink;


import java.util.Scanner;

public class UserInterface {
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        this.order = new Order();
    }


    public void homeScreen(){
    boolean running = true;
        while (running){
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
                SandwichBuilder sandwichBuilder = new SandwichBuilder();
                order.addSandwich(sandwichBuilder.buildSandwich());
            } else if (choice == 2) {
                order.addDrink(addDrink());
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

    public void checkout() {
        System.out.println("\n--- Your Order ---");
        System.out.println(order);

        OrderService orderService = new OrderService();
        double totalAmount = orderService.getTotal(order);
        System.out.println("Total Amount: $" + totalAmount);

        System.out.println("Is everything added to your order? 1- Yes , 2- No");
        String confirmation = scanner.nextLine();

        // Handle user input and order saving
        if (confirmation.equalsIgnoreCase("yes")) {
            // Attempt to save the order to a receipt file
            try {
                Receipt.saveOrder(order);  // Save the order to a file
                System.out.println("Order Created and Receipt Saved.");
            } catch (Exception e) {
                // Handle any errors that occur during the saving process
                System.err.println("There was an error while saving the receipt: " + e.getMessage());
            }

        } else if (confirmation.equals("2")) {
            System.out.println("You can modify your order or continue shopping.");
            homeScreen();  // Assuming homeScreen() navigates back to the shopping menu
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter 1 for Yes or 2 for No.");
        }
    }
}