package com.pluralsight;

import com.pluralsight.Toppings.*;
import com.pluralsight.Products.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichBuilder {
    private Scanner scanner = new Scanner(System.in);


    // Method to build a sandwich by interacting with the user.
    public Sandwich buildSandwich() {
        System.out.println("\n--- Sandwich Builder ---");

    // Ask user for the sandwich size (4, 8, or 12 inches).
        System.out.print("Size (4/8/12): ");
        String size = scanner.nextLine();


        System.out.println("\n----Build Your Sandwich----");
    // Ask user to choose bread type.
        System.out.println("Please Select Your Bread.");
        System.out.println("1- White\n" +
                "2- Wheat\n" +
                "3- Rye\n" +
                "4- Wrap\n");
        String breadType = scanner.nextLine();
        String selection = null;
    // Switch case to assign the selected bread type.
        switch (breadType) {
            case "1":
                selection = "White";
                break;
            case "2":
                selection = "Wheat";
                break;
            case "3":
                selection = "Rye";
                break;
            case "4":
                selection = "Wrap";
                break;
            default:
                System.out.println("Invalid Option!");
        }
    // Ask if the sandwich should be toasted

        System.out.print("Toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

    // Collect toppings selected by the user.
        List<Topping> toppings = new ArrayList<>();
        toppings.addAll(selectToppings());

    // Create a new Sandwich object with the selected options and return it.
        return new Sandwich(size, selection, toasted, toppings);
    }



    // Method to allow the user to select various types of toppings (meat, cheese, sauces, regular).
    public List<Topping> selectToppings() {
        List<Topping> kazim = new ArrayList<>();



        while (true) {
    // Prompt the user to select a topping category or finish adding toppings.

            System.out.println("Which toppings would you like to add? 1- Meat, 2- Cheese, 3- Sauce, 4- Regular toppings. 0- Finish adding toppings");
            String customerToppingSelection = scanner.nextLine();

    // Switch case to handle the different topping categories.
            switch (customerToppingSelection) {
                case "1":
                    kazim.addAll(addMeat());                                               //Calls method to add meat toppings
                    break;
                case "2":
                    kazim.addAll(addCheese());                                           // Calls method to add cheese toppings.
                    break;
                case "3":
                    kazim.addAll(addSauce());                                            // Calls method to add sauce toppings.

                    break;
                case "4":
                    kazim.addAll(addRegularToppings());                                  // Calls method to add regular toppings.
                    break;
                case "0":
                    return kazim;                                                        // Return the list of toppings when finished.
                default:
                    System.out.println("Invalid Option!");                              // Handle invalid option

            }
        }

    }
    // Method to allow the user to select meat toppings.
       public  List<Meat>addMeat(){

        List<Meat>meats = new ArrayList<>();                // List to hold meat toppings
           while (true) {

   // Display options for meat toppings.
               System.out.println("Select one of the following meats. Enter 0 to exit adding meats:- steak\n" +
                       "- ham\n" +
                       "- salami\n" +
                       "- roast beef\n" +
                       "- chicken\n" +
                       "- bacon ");
               String meatSelection = scanner.nextLine();

   // Exit the loop if user enters 0.

               if (meatSelection.equalsIgnoreCase("0")){
                   return meats;
               }
   // Add the selected meat to the list
               meats.add(new Meat(meatSelection));

           }

}
    // Method to allow the user to select cheese toppings.
        public List<Cheese>addCheese(){

        List<Cheese>cheeses = new ArrayList<>();                        // List to hold cheese toppings
            while (true) {
    // Display options for cheese toppings.
                System.out.println("Select one of the following cheese and if you don`t want to add more cheese please enter 0: - american\n" +
                "- provolone\n" +
                "- cheddar\n" +
                "- swiss");
                String cheeseSelection = scanner.nextLine();
    // Exit the loop if user enters 0.
                if(cheeseSelection.equalsIgnoreCase("0")){
                    return cheeses;
                }
    // Add the selected cheese to the list
                cheeses.add(new Cheese(cheeseSelection));
            }
}
    // Method to allow the user to select sauce toppings.
        public List<Sauce>addSauce(){
        List<Sauce>sauces = new ArrayList<>();                          // List to hold sauce toppings

    // Display options for sauce toppings.
            while (true) {
                System.out.println("Select one of the following sauce and if you don`t want to add more sauces please enter 0: - mayo\n" +
                            "- mustard\n" +
                            "- ketchup\n" +
                            "- ranch\n" +
                            "- thousand islands\n" +
                            "- vinaigrette ") ;
                String sauceSelection = scanner.nextLine();

    // Exit the loop if user enters 0
                if(sauceSelection.equalsIgnoreCase("0")){
                    return sauces;
                }
    // Add the selected sauce to the list
                sauces.add(new Sauce(sauceSelection));
            }
        }
    // Method to allow the user to select regular (non-meat, non-cheese(not premium)) toppings.
        public List<RegularTopping>addRegularToppings(){
        List<RegularTopping>regularToppings = new ArrayList<>();                                        // List to hold regular toppings
            while (true) {
    // Display options for regular toppings.
                System.out.println("Select one of the following regular toppings and if you don`t want to choose more toppings please enter 0:- lettuce\n" +
                        "- peppers\n" +
                        "- onions\n" +
                        "- tomatoes\n" +
                        "- jalepenos\n" +
                        "- cucumbers\n" +
                        "- pickles\n" +
                        "- guacamole\n" +
                        "- mushrooms ");
                String regularToppingSelection = scanner.nextLine();
    // Exit the loop if user enters 0
                if(regularToppingSelection.equalsIgnoreCase("0")){return regularToppings;}

    // Add the selected regular topping to the list
                regularToppings.add(new RegularTopping(regularToppingSelection));
            }
        }
}
