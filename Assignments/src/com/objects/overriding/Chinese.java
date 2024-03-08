package com.objects.overriding;

public class Chinese extends Menu{

    void showItems(String type){
        if(type.equals("starters")){
            System.out.println("Gobi 65");
            System.out.println("fried Chicken rice");
            System.out.println("KFC");
            System.out.println("Sushi");
        } else if (type.equals("lunch")) {
            System.out.println("Fried chicken");
            System.out.println("Chin chan rice");
            System.out.println("Chinese Mutton Biriyani");
            System.out.println("ChineseFish biriyani");
        }else{
            System.out.println("Deserts!");
            System.out.println("......");
        }
    }

    void printGames(){
        System.out.println("Board games are available");
    }
}
