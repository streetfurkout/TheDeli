package com.pluralsight.Order;

import com.pluralsight.Order.Order;
import com.pluralsight.Products.OrderService;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    // Method to save order details to a receipt file
    public static void saveOrder(Order order) {
        // Define the date-time format for the file name
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String fileName = "receipts/" + timestamp + ".txt";

        // Ensure that the "receipts" directory exists
        java.io.File directory = new java.io.File("receipts");
        if (!directory.exists()) {
            directory.mkdir();
        }

        // Write order details to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Order Summary:\n");
            writer.write(order.toString());
            OrderService orderService = new OrderService();
            writer.write("\nTotal Cost: $" + orderService.getTotal(order) + "\n");
            System.out.println("Receipt saved as " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}