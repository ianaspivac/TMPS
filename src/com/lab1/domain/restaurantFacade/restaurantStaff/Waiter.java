package com.lab1.domain.restaurantFacade.restaurantStaff;

import utilities.Order;
import com.lab1.domain.orderServingAdapter.ServingLocally;

public class Waiter {
    public void writeOrder(String[] order) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Waiter takes the order:");
        for (String food : order) {
            switch (food) {
                case "miniChickenBurger":
                    System.out.print(" Mini Chicken Burger;");
                    break;
                case "miniCheeseBurger":
                    System.out.print(" Mini Cheese Burger;");
                    break;
                case "chickenBurger":
                    System.out.print(" Chicken Burger;");
                    break;
                case "chillyBurger":
                    System.out.print(" Chilly Burger;");
                    break;
                case "cheeseBurger":
                    System.out.print(" Cheese Burger;");
                    break;
                case "shrimpBurger":
                    System.out.print(" Shrimp Burger;");
                    break;
                case "americanaPizza":
                    System.out.print(" Americana Pizza;");
                    break;
                case "chickenPizza":
                    System.out.print(" Chicken Pizza;");
                    break;
                case "funghiPizza":
                    System.out.print(" Funghi Pizza;");
                    break;
                case "pepperoniPizza":
                    System.out.print(" Pepperoni Pizza;");
                    break;
            }
        }
    }

    public void sendToKitchen() {
        System.out.println("\nOrder is sent to kitchen.");
    }

    public void serveCustomer(Order order) {
        ServingLocally serving = new ServingLocally();

        serving.serveOrder("takeOut", order);
    }
}
