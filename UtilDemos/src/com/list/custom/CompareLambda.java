package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {

        List<Vehicle> vehicles = Arrays.asList(

                new Vehicle("honda", "City", 2390400),
                new Vehicle("Tata", "Nexon", 2345642),
                new Vehicle("Hyundai", "Santro", 5465645),
                new Vehicle("Audi", "A100", 35445634),
                new Vehicle("Maruti", "Alto",676476));

        System.out.println("Before sorting.......");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles, (o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

        System.out.println();
        System.out.println("After sorting by brand.....");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles, (o1, o2) -> o1.getModel().compareTo(o2.getBrand()));

        System.out.println();
        System.out.println("After sorting by model.....");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        Collections.sort(vehicles, ((o1, o2) -> ((Double)o1.getPrice()).compareTo(o2.getPrice())));

        System.out.println();
        System.out.println("After sorting by price.....");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
}
