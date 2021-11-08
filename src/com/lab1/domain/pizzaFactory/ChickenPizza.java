package com.lab1.domain.pizzaFactory;

public class ChickenPizza extends Pizza{
    private String name = "Chicken Pizza";
    private int price = 94;
    private String[] ingredients = new String[]{"Chicken","Corn","Bell Pepper","Mozzarela"};

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
