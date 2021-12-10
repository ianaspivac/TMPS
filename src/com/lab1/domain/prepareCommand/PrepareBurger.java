package com.lab1.domain.prepareCommand;

import utilities.Order;

public class PrepareBurger implements Prepare {
    private Food food;

    public PrepareBurger(Food food) {
        this.food = food;
    }

    public Order execute(Order order) {
        return food.burger(order);
    }
}