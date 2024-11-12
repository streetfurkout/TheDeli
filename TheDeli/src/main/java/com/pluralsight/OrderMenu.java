package com.pluralsight;

import java.util.Scanner;

public class OrderMenu {
    private final Order order;
    private final Scanner scanner = new Scanner(System.in);
    public OrderMenu(Order order) {
        this.order = order;
    }
}