package com.lab1.domain.burgerBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Burger {
    private final String name; // required
    private final int price; // required
    private final String bun; // required
    private final String sauce; // required
    private final String meat; // required
    private final String[] vegetables; // optional
    private final String cheese; // optional
    private List<String> ingredients = new ArrayList<>();


    private Burger(BurgerBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.bun = builder.bun;
        this.sauce = builder.sauce;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
        this.cheese = builder.cheese;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public String getMeat() {
        return meat;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public String getCheese() {
        return cheese;
    }

    public List getIngredients() {
        return ingredients;
    }

    public void burgerInfo() {
        System.out.println("---------------------------");
        System.out.println("Burger name: " + this.getName());
        System.out.println("Price:" + this.getPrice());
        System.out.println("Bun type: " + this.getBun());
        System.out.println("Sauce: " + this.getSauce());
        System.out.println("Meat: " + this.getMeat());
        if (this.getVegetables() != null) {
            System.out.println("Additional ingredients: " + Arrays.toString(this.getVegetables()));
        }
        if (this.getCheese() != null) {
            System.out.println("Cheese: " + this.getCheese());
        }
    }

    public static class BurgerBuilder {
        private final String name; // required
        private final int price; // required
        private final String bun; // required
        private final String sauce; // required
        private final String meat; // required
        private String[] vegetables; // optional
        private String cheese; // optional

        public BurgerBuilder(String name, int price, String bun, String sauce, String meat) {
            this.name = name;
            this.price = price;
            this.bun = bun;
            this.sauce = sauce;
            this.meat = meat;
        }

        public BurgerBuilder vegetables(String[] vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public BurgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Burger build() {
            Burger burger = new Burger(this);
            return burger;
        }

    }

}
