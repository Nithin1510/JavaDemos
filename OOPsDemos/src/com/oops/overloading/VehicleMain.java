package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Vehicle("BMW");
        Vehicle vehicle2 = new Vehicle("audi","p303");
        Vehicle vehicle3 = new Vehicle("benz",334000,"p202");

        System.out.println("1");
        vehicle.getDetails();

        System.out.println("2");
        vehicle1.getDetails();

        System.out.println("3");
        vehicle2.getDetails();

        System.out.println("4");
        vehicle3.getDetails();
    }
}
