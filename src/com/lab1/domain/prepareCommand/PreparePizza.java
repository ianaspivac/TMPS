package com.lab1.domain.prepareCommand;

import utilities.Order;

public class PreparePizza implements Prepare {
    private Food food;

    public PreparePizza(Food food) {
        this.food = food;
    }

    public Order execute(Order order) {
        return food.pizza(order);
    }
}
