package com.lab1.domain.pizzaFactory;

public class PizzaFactory {
    public static Pizza getPizza(String pizzaType) {
        switch (pizzaType) {
            case "americanaPizza":
                return new AmericanaPizza();
            case "chickenPizza":
                return new ChickenPizza();
            case "funghiPizza":
                return new FunghiPizza();
            case "pepperoniPizza":
                return new PepperoniPizza();
            default:
                return null;
        }
    }
}
