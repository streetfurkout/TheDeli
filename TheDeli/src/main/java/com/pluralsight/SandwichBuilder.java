package com.pluralsight;

import com.pluralsight.Toppings.Topping;
import com.pluralsight.orderedService.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichBuilder {
    private final Scanner scanner = new Scanner(System.in);

    public Sandwich buildSandwich() {
        System.out.println("\n--- Sandwich Builder ---");


        System.out.print("Size (4/8/12): ");
        String size = scanner.nextLine();


        System.out.print("Bread Type (white/wheat/rye/wrap): ");
        String bread = scanner.nextLine();


        System.out.print("Toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");


        List<Topping> toppings = new ArrayList<>();
        toppings.addAll(selectToppings());

        return new Sandwich(size, bread, toasted, toppings);
    }

    private List<Topping> selectToppings() {
        List<Topping> toppings = new ArrayList<>();
        System.out.println("Do you want to add cheese or steak? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            toppings.add(new PremiumTopping("Steak", 1.00));
        }
        return toppings;
    }
}