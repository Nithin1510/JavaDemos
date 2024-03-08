package com.oops.overloading;

public class Shape {

    void calcArea(int length){
        System.out.println("Sq "+(length*length));
    }

//    int calcArea(int length, int breadth){
//        return length*breadth;
//    }

    void calArea(double radius){
        System.out.println("Circle "+Math.PI*Math.pow(radius,2));
    }

    double calArea(double base, int height){
        return (0.4*base*height);
    }
}
