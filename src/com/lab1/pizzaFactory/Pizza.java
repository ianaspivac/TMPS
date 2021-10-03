package com.lab1.pizzaFactory;

public abstract class Pizza {
    public abstract String getName();
    public abstract int getPrice();
    public abstract String[] getIngredients();

    public void pizzaInfo() {
        System.out.println("Name:" + this.getName());
        System.out.println("Price:" + this.getPrice());
        System.out.println("Ingredients:" + this.getIngredients());
    }
    public void order() {
        System.out.println(this.getName()+" is ordered");
    }
}

