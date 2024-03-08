package com.inter.fullimp;

public class Car extends Vehicle implements IInternal, IExternal{

    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void insuranceDetails() {
        System.out.println("Car insurance");
    }

    @Override
    void getMileage() {
        System.out.println("car mileage");
    }

    @Override
    public void interior() {System.out.println("Car internal Accessories");}

    @Override
    public void exterior() {
        System.out.println("Car external Accessories");
    }

    @Override
    public void showAccessories() {
        System.out.println("Car Accessories");
    }

    void showType(){
        if (type.equals("sedan"))
            System.out.println("Luxury car");
        else if(type.equals("suv"))
            System.out.println("SUV");
        else System.out.println();
    }

}
