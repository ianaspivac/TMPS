package com.lab1.domain.orderServingAdapter;

import utilities.Order;
import com.lab1.domain.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

public class ServingLocally implements Serving {
    ServingAdapter servingAdapter;

    @Override
    public void serveOrder(String servingType, Order order) {

        if (servingType.equalsIgnoreCase("locally")) {
            System.out.println("Waiter brings the dishes to the client's table:");
            order.getPizzas().forEach(Pizza::pizzaInfo);
            order.getBurgers().forEach(Burger::burgerInfo);
        } else {
            servingAdapter = new ServingAdapter(servingType);
            servingAdapter.serveOrder(servingType, order);
        }
    }
}
