package com.inter.lam;

public class waiter {
    void availableItems(IMenu menu){
        System.out.println("Welcome to hotel!");
        menu.showMenu();
        System.out.println("Order now");
    }
}
