package com.util.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CheckDemo {
    public static void main(String[] args) {
        List <String> fruits = new ArrayList<String >();

        fruits.add("apple");
        fruits.add("green apple");
        fruits.add("pineapple");
        fruits.add("blueberry");
        fruits.add("rassberry");
        fruits.add("blackberry");
        fruits.add("mango");

        System.out.println("Fruits List.....");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        List <String> fruitsWithBerry = new ArrayList<String >();

        for(String fruit: fruits){
            if(fruit.toLowerCase().contains("berry")){
                fruitsWithBerry.add(fruit);
            }
        }

        System.out.println();
        System.out.println("Berry List.....");
        for (String berry: fruitsWithBerry){
            System.out.println(berry);
        }

        List <String> fruitsWithApple = new ArrayList<String >();

        for(String fruit: fruits){
            if(fruit.toLowerCase().contains("apple")){
                fruitsWithApple.add(fruit);
            }
        }

        System.out.println();
        System.out.println("Apple List.....");
        for (String apple: fruitsWithApple){
            System.out.println(apple);
        }
    }
}
