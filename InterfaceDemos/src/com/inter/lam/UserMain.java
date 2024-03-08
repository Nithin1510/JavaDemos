package com.inter.lam;

public class UserMain {
    public static void main(String[] args) {

        waiter waiter = new waiter();

        waiter.availableItems(() -> {
                    System.out.println("Indian : ");
                    System.out.println("Biriyani");
                    System.out.println("Belluli Kebab");
                    System.out.println("Grill chicken");
        });
    }
}
