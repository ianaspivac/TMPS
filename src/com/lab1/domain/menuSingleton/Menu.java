package com.lab1.domain.menuSingleton;

import com.lab1.burgerBuilder.Burger;
import com.lab1.burgerBuilder.BurgerClient;
import com.lab1.domain.pizzaFactory.Pizza;
import com.lab1.domain.pizzaFactory.PizzaFactory;


public class Menu {
    private Pizza[] pizzas;
    private Burger[] burgers;

    private static Menu instance = new Menu();

    private Menu() {
        this.pizzas = new Pizza[]{PizzaFactory.getPizza("americanaPizza"),
                PizzaFactory.getPizza("chickenPizza"),
                PizzaFactory.getPizza("funghiPizza"),
                PizzaFactory.getPizza("pepperoniPizza")};
        this.burgers = new Burger[]{BurgerClient.getBurger("miniChickenBurger"),
                BurgerClient.getBurger("miniCheeseBurger"),
                BurgerClient.getBurger("chickenBurger"),
                BurgerClient.getBurger("chillyBurger"),
                BurgerClient.getBurger("shrimpBurger"),
                BurgerClient.getBurger("cheeseBurger")};
    }

    public static Menu getInstance() {
        return instance;
    }

    public void showMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i].pizzaInfo();
        }

        for (int i = 0; i < burgers.length; i++) {
            burgers[i].burgerInfo();
        }
    }
}
