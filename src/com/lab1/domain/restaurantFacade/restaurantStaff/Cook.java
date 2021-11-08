package com.lab1.domain.restaurantFacade.restaurantStaff;

import utilities.Order;
import com.lab1.burgerBuilder.Burger;
import com.lab1.burgerBuilder.BurgerClient;
import com.lab1.domain.pizzaFactory.Pizza;
import com.lab1.domain.pizzaFactory.PizzaFactory;

public class Cook {
    Order order;

    public void prepareFood(String[] order) {
        this.order = new Order();
        for (String food : order)
            whichFood(food);
    }

    public Order callWaiter() {
        System.out.println("Cook prepared the order and waits to be served.");
        return this.order;
    }

    private Pizza preparePizza(String pizzaType) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(pizzaType);
        pizza.preparePizza();

        this.order.addPizza(pizza);

        return pizza;
    }

    private Burger prepareBurger(String burgerType) {
        BurgerClient burgerClient = new BurgerClient();
        Burger burger = burgerClient.getBurger(burgerType);
        burger.prepareBurger();

        this.order.addBurger(burger);

        return burger;
    }

    private void whichFood(String foodName) {
        String[] pizzas = {"americanaPizza", "chickenPizza", "funghiPizza", "pepperoniPizza"};
        String[] burgers = {"miniChickenBurger", "miniCheeseBurger", "chickenBurger", "chillyBurger", "cheeseBurger", "shrimpBurger"};

        for (String pizza : pizzas) if (pizza.equals(foodName)) preparePizza(foodName);
        for (String burger : burgers) if (burger.equals(foodName)) prepareBurger(foodName);
    }
};
