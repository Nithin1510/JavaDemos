package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape shape = (int c, int d) -> {
            System.out.println("Area is "+(c*d));
        };
        shape.area(2,3);

        shape = (int x, int y) -> System.out.println("area of triangle : "+(x*y));
        shape.area(3,4);

        shape = (int x, int y) -> System.out.println("area of square : "+(x*y));
        shape.area(6,4);

        shape = (int x, int y) -> System.out.println("area of cube : "+(x*y));
        shape.area(9,4);
    }
}
