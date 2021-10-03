package com.lab1.pizzaFactory;

public class PizzaFactory {
    public static Pizza getPizza(String pizzaType) {
        switch (pizzaType) {
            case "americana":
                return new AmericanaPizza();
            case "chicken":
                return new ChickenPizza();
            case "funghi":
                return new FunghiPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                return null;
        }
    }
}
