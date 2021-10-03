package com.lab1;

import com.lab1.menuSingleton.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        menu.showMenu();
    }
}
