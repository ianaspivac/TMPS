package com.lab1.domain.orderServingAdapter;

import utilities.Order;
import com.lab1.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

public class ServeTakeOut implements ServingMethod {

    @Override
    public void serveLocally(Order order) {
    }

    @Override
    public void serveTakeOut(Order order) {
        System.out.println("Waiter packages the dishes and brings them to clients:");
        order.getPizzas().forEach(Pizza::pizzaInfo);
        order.getBurgers().forEach(Burger::burgerInfo);
    }

    @Override
    public void serveViaDelivery(Order order) {
    }
}
