package com.lab1.domain.orderServingAdapter;

import utilities.Order;

public class ServingAdapter implements Serving {

    ServingMethod servingMethod;

    public ServingAdapter(String servingType){

        if(servingType.equalsIgnoreCase("takeOut") ){
            servingMethod = new ServeTakeOut();

        }else if (servingType.equalsIgnoreCase("delivery")){
            servingMethod = new ServeViaDelivery();
        }
    }

    @Override
    public void serveOrder(String servingType, Order order) {

        if(servingType.equalsIgnoreCase("takeOut")){
            servingMethod.serveTakeOut(order);
        }
        else if(servingType.equalsIgnoreCase("delivery")){
            servingMethod.serveViaDelivery(order);
        }
    }
}
