package com.lab1.domain.pizzaFactory;

public class AmericanaPizza extends Pizza{
    private String name = "Americana Pizza";
    private int price = 118;
    private String[] ingredients = new String[]{"Chicken","Tomatoes","Ham","Olives","Mushrooms","Parmesan"};

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
