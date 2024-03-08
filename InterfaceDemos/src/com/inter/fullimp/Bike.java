package com.inter.fullimp;

public class Bike extends Vehicle implements IInsurance, IExternal{

    double capacity;

    public Bike(String brand, String model, double price, double capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }

    @Override
    public void showAccessories() {
        System.out.println("Bike Accessories");
    }

    @Override
    public void exterior() {
        System.out.println("Bike external Accessories");
    }

    @Override
    void getMileage() {
        System.out.println("Bike Mileage");
    }

    void checkCapacity(){
        if (capacity == 350){
            System.out.println("Amazing bike");
        }
    }
}
