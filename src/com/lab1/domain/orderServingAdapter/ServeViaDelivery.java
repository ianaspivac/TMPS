package com.lab1.domain.orderServingAdapter;

import utilities.Order;
import com.lab1.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

public class ServeViaDelivery implements ServingMethod {

    @Override
    public void serveLocally(Order order) {
    }

    @Override
    public void serveTakeOut(Order order) {
    }

    @Override
    public void serveViaDelivery(Order order) {
        System.out.println("Waiter packs the dishes and gives them to courier:");
        order.getPizzas().forEach(Pizza::pizzaInfo);
        order.getBurgers().forEach(Burger::burgerInfo);
    }
}
