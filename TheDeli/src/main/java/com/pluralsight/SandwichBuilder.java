package com.pluralsight;

import com.pluralsight.Toppings.*;
import com.pluralsight.Products.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichBuilder {
    private Scanner scanner = new Scanner(System.in);

    public Sandwich buildSandwich() {
        System.out.println("\n--- Sandwich Builder ---");


        System.out.print("Size (4/8/12): ");
        String size = scanner.nextLine();


        System.out.println("\n----Build Your Sandwich----");
        System.out.println("Please Select Your Bread.");
        System.out.println("1- White\n" +
                "2- Wheat\n" +
                "3- Rye\n" +
                "4- Wrap\n");
        String breadType = scanner.nextLine();
        String selection = null;
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

        System.out.print("Toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");


        List<Topping> toppings = new ArrayList<>();
        toppings.addAll(selectToppings());

        return new Sandwich(size, selection, toasted, toppings);

    }

    public List<Topping> selectToppings() {
        List<Topping> toppings = new ArrayList<>();
        System.out.println("Which toppings would you like to add? 1- Meat, 2- Cheese, 3- Sauce, 4- Regular toppings. 0- Finish adding toppings");
        String customerToppingSelection = scanner.nextLine();

        while (true) {
            switch (customerToppingSelection) {
                case "1":
                    toppings.addAll(addMeat());
                    break;
                case "2":
                    toppings.addAll(addCheese());
                    break;
                case "3":
                    toppings.addAll(addSauce());

                    break;
                case "4":
                    toppings.addAll(addRegularToppings());
                    break;
                case "0":
                    return toppings;
                default:
                    System.out.println("Invalid Option!");

            }
        }

    }
       public  List<Meat>addMeat(){

        List<Meat>meats = new ArrayList<>();
           while (true) {
               System.out.println("Select one of the following meats. Enter 0 to exit adding meats:- steak\n" +
                       "- ham\n" +
                       "- salami\n" +
                       "- roast beef\n" +
                       "- chicken\n" +
                       "- bacon ");
               String meatSelection = scanner.nextLine();

               if (meatSelection.equalsIgnoreCase("0")){
                   return meats;
               }

               meats.add(new Meat(meatSelection));

           }

}
        public List<Cheese>addCheese(){

        List<Cheese>cheeses = new ArrayList<>();
            while (true) {
                System.out.println("Select one of the following cheese and if you don`t want to add more cheese please enter 0: - american\n" +
                "- provolone\n" +
                "- cheddar\n" +
                "- swiss");
                String cheeseSelection = scanner.nextLine();
                if(cheeseSelection.equalsIgnoreCase("0")){
                    return cheeses;
                }
                cheeses.add(new Cheese(cheeseSelection));
            }
}
        public List<Sauce>addSauce(){
        List<Sauce>sauces = new ArrayList<>();
            while (true) {
                System.out.println("Select one of the following sauce and if you don`t want to add more sauces please enter 0: - mayo\n" +
                            "- mustard\n" +
                            "- ketchup\n" +
                            "- ranch\n" +
                            "- thousand islands\n" +
                            "- vinaigrette ") ;
                String sauceSelection = scanner.nextLine();
                if(sauceSelection.equalsIgnoreCase("0")){
                    return sauces;
                }
                sauces.add(new Sauce(sauceSelection));
            }
        }

        public List<RegularTopping>addRegularToppings(){
        List<RegularTopping>regularToppings = new ArrayList<>();
            while (true) {
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
                if(regularToppingSelection.equalsIgnoreCase("0")){return regularToppings;}
                regularToppings.add(new RegularTopping(regularToppingSelection));
            }
        }
}
