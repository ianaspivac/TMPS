package com.lab1.domain.pizzaFactory;

import java.util.Arrays;

public abstract class Pizza {
    public abstract String getName();

    public abstract int getPrice();

    public abstract String[] getIngredients();

    public void pizzaInfo() {
        System.out.println("---------------------------");
        System.out.println("Pizza name:" + this.getName());
        System.out.println("Price:" + this.getPrice());
        System.out.println("Ingredients:" + Arrays.toString(this.getIngredients()));
    }
}

