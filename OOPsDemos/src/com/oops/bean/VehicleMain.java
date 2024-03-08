package com.oops.bean;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        vehicle.setModel("Amaze");
        vehicle.setPrice(3000000);
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle.toString());
    }
}
