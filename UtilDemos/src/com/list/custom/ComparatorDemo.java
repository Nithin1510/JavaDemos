package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List <Vehicle> vehicles = Arrays.asList(
                new Vehicle("honda", "City", 2390400),
                new Vehicle("Tata", "Nexon", 2345642),
                new Vehicle("Hyundai", "Santro", 5465645),
                new Vehicle("Audi", "A100", 35445634),
                new Vehicle("Maruti", "Alto",676476));

        System.out.println("Before sorting.......");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("After sorting by brand.....");
        Collections.sort(vehicles, new BrandSort());
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("After sorting by model.....");
        Collections.sort(vehicles, new ModelSort());
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("After sorting by price.....");
        Collections.sort(vehicles, new PriceSort());
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
}
