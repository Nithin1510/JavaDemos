package com.inter.fullimp;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Benz", "P303", 34000, "sedan");
        car.getDetails();
        car.getMileage();
        car.showAccessories();
        car.insuranceDetails();
        car.interior();
        car.exterior();
        car.showType();

        Bike bike = new Bike("BMW", "XM", 45000, 350);
        bike.getDetails();
        bike.getMileage();
        bike.showAccessories();
        bike.insuranceDetails();
        bike.exterior();
        bike.checkCapacity();
    }
}
