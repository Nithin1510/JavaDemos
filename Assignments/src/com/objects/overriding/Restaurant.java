package com.objects.overriding;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your choice : ");
//        System.out.println("Breakfast");
//        System.out.println("Lunch");
//        System.out.println("desserts");

//        String choice = sc.next();
        Menu menu = new Chinese();
//        menu.showItems("breakfast");

//        menu = new Indian();

        Chinese chinese = (Chinese) menu;
        chinese.printGames();

//        menu.showItems("breakfast");
//        Menu menu1 = new Indian();
//        menu1.showItems("lunch");
    }
}
