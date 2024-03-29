package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Audi","X100", "Black");
        Vehicle vehicle2 = new Vehicle("Audi", "X100", "White");
        Vehicle vehicle3 = new Vehicle("Audi","A100", "White");
        Vehicle vehicle4 = new Vehicle("Audi","X100", "Black");

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle2.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));

        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}
