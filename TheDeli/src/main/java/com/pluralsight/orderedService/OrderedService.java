package com.pluralsight.orderedService;

import com.pluralsight.Order;

public class OrderedService {
    public double getTotal(Order order){


            double sandwichTotal = 0;
            for (Sandwich sandwich : order.getSandwiches()) {
                sandwichTotal += sandwich.calculatePrice();
            }

            double drinkTotal = 0;
            for (Drink drink : order.getDrinks()) {
                drinkTotal += drink.calculatePrice();
            }

            double chipsTotal = order.getChips().size() * 1.50;

            return sandwichTotal + drinkTotal + chipsTotal;
        }
    }

