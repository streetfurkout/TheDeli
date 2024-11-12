package com.pluralsight;

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

       