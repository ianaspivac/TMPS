package com.lab1.domain.restaurantFacade.restaurantStaff;

import com.lab1.domain.prepareCommand.Prepare;
import utilities.Order;

public class Cook {
    Order order = new Order();
    Prepare prepare;

    public void reciveOrder(Prepare prepare){
       this.prepare = prepare;
    }

    public void cookFood(){
        order = prepare.execute(order);
    }

    public Order callWaiter() {
        System.out.println("Cook prepared the order and waits to be served.");
        return order;
    }
};
