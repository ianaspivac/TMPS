package com.lab1.domain.prepareCommand;

import com.lab1.domain.burgerBuilder.Burger;
import com.lab1.domain.burgerBuilder.BurgerClient;
import com.lab1.domain.pizzaFactory.Pizza;
import com.lab1.domain.pizzaFactory.PizzaFactory;
import utilities.Order;

public class Food {
    private String foodType;

    public Food(String foodType) {
        this.foodType = foodType;
    }

    public Order burger(Order order) {
        BurgerClient burgerClient = new BurgerClient();
        Burger burger = burgerClient.getBurger(foodType);
        order.addBurger(burger);
        System.out.println(burger.getName() + " was prepared.");

        return order;
    }

    public Order pizza(Order order) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(foodType);
        order.addPizza(pizza);
        System.out.println(pizza.getName() + " was prepared.");

        return order;
    }
}
