package com.lab1.domain.restaurantFacade;

import com.lab1.domain.prepareCommand.Food;
import com.lab1.domain.prepareCommand.PrepareBurger;
import com.lab1.domain.prepareCommand.PreparePizza;
import utilities.Order;
import com.lab1.domain.restaurantFacade.restaurantStaff.Cook;
import com.lab1.domain.restaurantFacade.restaurantStaff.Waiter;

public class RestaurantFacade {
    private Waiter waiter;
    private Cook cook;
    public Order order;

    public RestaurantFacade() {
        this.waiter = new Waiter();
        this.cook = new Cook();
    }

    private void prepareFood(String[] orders) {
        for (String foodName : orders) {
            Food food = new Food(foodName);
            String[] pizzas = {"americanaPizza", "chickenPizza", "funghiPizza", "pepperoniPizza"};
            String[] burgers = {"miniChickenBurger", "miniCheeseBurger", "chickenBurger", "chillyBurger", "cheeseBurger", "shrimpBurger"};

            for (String pizza : pizzas) {
                if (pizza.equals(foodName)) {
                    PreparePizza preparePizza = new PreparePizza(food);
                    cook.reciveOrder(preparePizza);
                }
            }
            for (String burger : burgers) {
                if (burger.equals(foodName)) {
                    PrepareBurger prepareBurger = new PrepareBurger(food);
                    cook.reciveOrder(prepareBurger);
                }
            }
            cook.cookFood();
        }
    }

    public Order orderFood(String[] order) {
        waiter.writeOrder(order);
        waiter.sendToKitchen();
        prepareFood(order);
        this.order = cook.callWaiter();
        waiter.serveCustomer(this.order);
        return this.order;
    }
}
