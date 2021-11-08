package com.lab1.domain.orderServingAdapter;

import utilities.Order;

public interface Serving {
    void serveOrder(String servingType, Order order);
}
