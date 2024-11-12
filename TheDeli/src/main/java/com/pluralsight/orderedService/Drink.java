package com.pluralsight.orderedService;

public class Drink implements ICalculatePrice {
    private String size;
    private String flavour;

    public Drink(String size, String flavour) {
        this.size = size;
        this.flavour = flavour;
    }


    @Override
    public double calculatePrice() {

        if(size.equalsIgnoreCase("small")){
            return 2.00;
        } else if (size.equalsIgnoreCase("medium")) {
            return 2.50;
        }else
            return 3.00;
    }
}
