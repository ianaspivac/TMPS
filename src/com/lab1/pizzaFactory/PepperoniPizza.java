package com.lab1.pizzaFactory;

public class PepperoniPizza extends Pizza{
    private String name = "Pepperoni Pizza";
    private int price = 96;
    private String[] ingredients = new String[]{"Salami","Hot Chilli Pepper","Mozzarella"};

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String[] getIngredients() {
        return this.ingredients;
    }
}
