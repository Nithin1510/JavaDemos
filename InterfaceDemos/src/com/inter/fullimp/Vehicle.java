package com.inter.fullimp;

public abstract class Vehicle implements IInsurance {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Vehicle {"+
                "Brand : "+brand + "\'"+
                ", Model : "+ model +"\'"+
                ", price : "+price +
                "}");
    }

    public void insuranceDetails(){
        System.out.println("This is the insurance details of the vehicle");
    }

    abstract void getMileage();
}
