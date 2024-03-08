package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {

        IMenu menu = () ->{
            System.out.println("Chinese : ");
            System.out.println("Chin chan");
            System.out.println("Shakti man");
            System.out.println("Snake special");
        };
        menu.showMenu();

        menu = () -> {
            System.out.println("Indian : ");
            System.out.println("Biriyani");
            System.out.println("Belluli Kebab");
            System.out.println("Grill chicken");
        };
        menu.showMenu();

        menu = () -> {
            System.out.println("Italian : ");
            System.out.println("Capuccino");
            System.out.println("Italian coffee");
            System.out.println("Pizza");
        };
        menu.showMenu();
    }
}
