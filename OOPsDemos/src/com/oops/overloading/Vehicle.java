package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        System.out.println("Default");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
//        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand,model);
        System.out.println("Three");
//        this.brand = brand;
//        this.model = model;
        this.price = price;
    }

    void getDetails(){
        if(brand!=null){
            System.out.println("car brand : "+brand);
        }
        if (price > 0) {
            System.out.println("Car price : "+price);
        }
        if(model!=null){
            System.out.println("Car model : "+model);
        }
    }
}
