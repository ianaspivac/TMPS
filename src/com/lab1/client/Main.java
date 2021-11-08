package com.lab1.client;

import com.lab1.domain.menuSingleton.Menu;
import com.lab1.domain.paymentBridge.*;
import com.lab1.domain.restaurantFacade.RestaurantFacade;
import utilities.CalculateBill;

public class Main {

    public static void main(String[] args) {
        CalculateBill calculateBill = new CalculateBill();

        Menu menu = Menu.getInstance();
        menu.showMenu();

        RestaurantFacade restaurantFacade = new RestaurantFacade();

        String[] order = {"chickenBurger", "americanaPizza"};
        int billSum = calculateBill.calculateBill(restaurantFacade.orderFood(order));

        Bill billLei = new LeiBill(billSum, new Card());
        Bill billDollar = new DollarBill(billSum, new Cash());
        billLei.payBill();
        billDollar.payBill();
    }
}
