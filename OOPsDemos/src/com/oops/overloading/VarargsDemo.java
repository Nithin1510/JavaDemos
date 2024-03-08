package com.oops.overloading;

public class VarargsDemo {

    void calcSum(String name, int... marks){
        System.out.println("Welcome "+ name);
        int sum = 0;
        for (int mark: marks){
            sum += mark;
        }
        System.out.println("Sum of all subjects is "+ sum);
    }

    void calcSum(String name){
        System.out.println("Welcome "+name);
    }
    public static void main(String[] args) {
        VarargsDemo varargsDemo = new VarargsDemo();
        varargsDemo.calcSum("Nithin");
        varargsDemo.calcSum("Kumar", 45, 35, 25);
        varargsDemo.calcSum("reddy", 34,56);
    }
}
