package com.pluralsight;
import java.util.Scanner;

public class OrderSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void startNewOrder() {
        Order order = new Order();
        UserInterface userInterface = new UserInterface(order);
        userInterface.displayOrderMenu();
    }
}