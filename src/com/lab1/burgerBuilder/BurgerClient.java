package com.lab1.burgerBuilder;


public class BurgerClient{
    public static Burger getBurger(String burgerType) {
        switch (burgerType) {
            case "chicken":
                return new Burger.BurgerBuilder("Chicken Burger",59,"Sesame seed", "Mustard","Chicken").vegetables(new String[]{"Rucola", "Cucumbers", "Onions", "Tomatoes"}).build();
            case "chilly":
                return new Burger.BurgerBuilder("Chilly Burger",60,"Plain", "Hot Chilly Sauce","Beef").vegetables(new String[]{"Pickles", "Hot Chilly Pepper"}).build();
            case "cheese":
                return new Burger.BurgerBuilder("Cheese Burger",59,"Plain", "Mustard","Beef").vegetables(new String[]{"Pickles", "Tomatoes","Lettuce","Pickles","Onions"}).cheese("Cheddar").build();
            case "shrimp":
                return new Burger.BurgerBuilder("Shrimp Burger",95,"Plain", "Mayonnaise","Shrimps").cheese("Philadelphia").build();
                default:
                return null;
        }
    }
}
