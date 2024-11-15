package com.pluralsight.Order;

import com.pluralsight.Products.Chips;
import com.pluralsight.Products.Drink;
import com.pluralsight.Products.Sandwich;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class OrderTest {

    @Test
    public void addSandwich_shouldAddToOrder() {
        // arrange
        Order order = new Order();
        Sandwich sandwich = new Sandwich("8", "Wheat", true, Arrays.asList());

        // act
        order.addSandwich(sandwich);

        // assert
        assertEquals(1, order.getSandwiches().size());
        assertTrue(order.getSandwiches().contains(sandwich));
    }

    @Test
    public void addDrink_shouldAddToOrder() {
        // arrange
        Order order = new Order();
        Drink drink = new Drink("Medium", "Fanta");

        // act
        order.addDrink(drink);

        // assert
        assertEquals(1, order.getDrinks().size());
        assertTrue(order.getDrinks().contains(drink));
    }

    @Test
    public void addChips_shouldAddToOrder() {
        // arrange
        Order order = new Order();
        Chips chips = new Chips("Salty Pepper");

        // act
        order.addChips(chips);

        // assert
        assertEquals(1, order.getChips().size());
        assertTrue(order.getChips().contains(chips));
    }
}