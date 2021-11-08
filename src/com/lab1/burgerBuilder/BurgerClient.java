package com.lab1.burgerBuilder;


public class BurgerClient{
    public static Burger getBurger(String burgerType) {
        switch (burgerType) {
            case "miniChickenBurger":
            return new Burger.BurgerBuilder("Mini Chicken Burger",30,"Sesame seed", "Mustard","Chicken").build();
            case "miniCheeseBurger":
                return new Burger.BurgerBuilder("Mini Cheese Burger",32,"Plain", "Mustard","Beef").cheese("Cheddar").build();
            case "chickenBurger":
                return new Burger.BurgerBuilder("Chicken Burger",59,"Sesame seed", "Mustard","Chicken").vegetables(new String[]{"Rucola", "Cucumbers", "Onions", "Tomatoes"}).build();
            case "chillyBurger":
                return new Burger.BurgerBuilder("Chilly Burger",60,"Plain", "Hot Chilly Sauce","Beef").vegetables(new String[]{"Pickles", "Hot Chilly Pepper"}).build();
            case "cheeseBurger":
                return new Burger.BurgerBuilder("Cheese Burger",59,"Plain", "Mustard","Beef").vegetables(new String[]{"Pickles", "Tomatoes","Lettuce","Pickles","Onions"}).cheese("Cheddar").build();
            case "shrimpBurger":
                return new Burger.BurgerBuilder("Shrimp Burger",95,"Plain", "Mayonnaise","Shrimps").cheese("Philadelphia").build();
                default:
                return null;
        }
    }
}
