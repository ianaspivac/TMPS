package com.lab1.domain.orderServingAdapter;

import utilities.Order;

public interface ServingMethod {
    void serveViaDelivery(Order order);

    void serveTakeOut(Order order);

}
