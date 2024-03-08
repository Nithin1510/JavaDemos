package com.objects.overriding;

public class Indian extends Menu {
    void showItems(String type) {
        if (type.equals("breakfast")) {
            System.out.println("Belluli Kebab");
            System.out.println("Chicken 65");
            System.out.println("Grill chicken");
            System.out.println("Prawns fry");
        } else if (type.equals("lunch")) {
            System.out.println("Hyderabad Chicken dum Biriyani");
            System.out.println("Fry piece biriyani");
            System.out.println("Mutton Biriyani");
            System.out.println("Fish biriyani");
        } else {
            System.out.println("Kaala Jamun!");
            System.out.println("Gulab Jamun");
            System.out.println("Rasagulla");
        }
    }
}
