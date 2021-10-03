package com.lab1.pizzaFactory;

public class FunghiPizza extends Pizza{
    private String name = "Funghi Pizza";
    private int price = 89;
    private String[] ingredients = new String[]{"Chicken","Tomatoes","Mushrooms","Bell Pepper","Mozzarella"};

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
