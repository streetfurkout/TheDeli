package com.pluralsight;
import java.util.Scanner;

public class OrderSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("---- DELI Order Menu Screen----");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                startNewOrder();
            } else if (choice == 0) {
                System.out.println("Program Ending...");
                running = false;
            } else {
                System.out.println("Invalid Option!! Please Try Again.");
            }
        }
    }

    private static void startNewOrder() {
        Order order = new Order();
        OrderMenu orderMenu = new OrderMenu(order);
        orderMenu.displayOrderMenu();
    }
}