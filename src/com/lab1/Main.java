package com.lab1;

import com.lab1.burgerBuilder.Burger;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("Sesame seed", "Ketchup","Beef")
                .build();

        System.out.println(burger);
    }
}
