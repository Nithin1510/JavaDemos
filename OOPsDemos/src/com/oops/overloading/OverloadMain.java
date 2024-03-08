package com.oops.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.calArea(10);
        shape.calArea(2.0);
        int rect =  (int)shape.calArea(10,20);
        System.out.println("Rectangle "+rect);
        double tri = shape.calArea(12.0,4);
        System.out.println("Triangle "+tri);
    }
}
