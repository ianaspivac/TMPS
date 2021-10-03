package com.lab1.otherMenuItems;

public class OtherMenuItem {
    private String name;
    private int price;

    public OtherMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void getOtherMenuItemInfo() {
        System.out.println("---------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
    }
}
