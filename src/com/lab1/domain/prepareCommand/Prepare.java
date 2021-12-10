package com.lab1.domain.prepareCommand;

import utilities.Order;

public interface Prepare {
    Order execute(Order order);
}
