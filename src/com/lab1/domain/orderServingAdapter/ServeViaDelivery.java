package com.lab1.domain.orderServingAdapter;

import utilities.Order;
import com.lab1.domain.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

public class ServeViaDelivery implements ServingMethod {

    @Override
    public void serveTakeOut(Order order) {
        System.out.println("Waiter packs the dishes and gives them to client:");
        order.getPizzas().forEach(Pizza::pizzaInfo);
        order.getBurgers().forEach(Burger::burgerInfo);
    }

    @Override
    public void serveViaDelivery(Order order) {
    }

}
