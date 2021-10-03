package com.lab1.menuSingleton;

import com.lab1.burgerBuilder.Burger;
import com.lab1.burgerBuilder.BurgerClient;
import com.lab1.pizzaFactory.Pizza;
import com.lab1.pizzaFactory.PizzaFactory;
import com.lab1.otherMenuItems.OtherMenuItem;

//menu is only one for the restaurant and it contains all possible dishes
public class Menu {
    private Pizza[] pizzas;
    private Burger[] burgers;
    private OtherMenuItem[] otherMenuItems;

    private static Menu instance = new Menu();

    private Menu() {
        this.pizzas = new Pizza[]{PizzaFactory.getPizza("americana"), PizzaFactory.getPizza("chicken")
                , PizzaFactory.getPizza("funghi"), PizzaFactory.getPizza("pepperoni")};
        this.burgers = new Burger[]{BurgerClient.getBurger("chicken"), BurgerClient.getBurger("chilly"), BurgerClient.getBurger("shrimp"), BurgerClient.getBurger("cheese")};
        this.otherMenuItems = new OtherMenuItem[]{new OtherMenuItem("Lemonade", 35), new OtherMenuItem("Hot Chocolate", 20), new OtherMenuItem("Latte", 25)
                , new OtherMenuItem("Espresso", 15), new OtherMenuItem("Cappuccino", 20), new OtherMenuItem("French Fries", 30), new OtherMenuItem("Nuggets", 35)
                , new OtherMenuItem("Buffalo wings", 35)};

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
        for (int i = 0; i < otherMenuItems.length; i++) {
            otherMenuItems[i].getOtherMenuItemInfo();
        }
    }

}
