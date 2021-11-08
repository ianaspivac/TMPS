package com.lab1.domain.restaurantFacade;

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

    public Order orderFood(String[] order) {
        waiter.writeOrder(order);
        waiter.sendToKitchen();
        cook.prepareFood(order);
        this.order = cook.callWaiter();
        waiter.serveCustomer(this.order);
        return this.order;
    }
}
