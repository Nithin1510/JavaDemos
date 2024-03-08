package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //create a reference of ishape
        IShape shape = new Rectangle();
        //pass this as a parameter
        shapeFactory.printArea(shape, 2,3);

        System.out.println("...........");

        shapeFactory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area ");
                System.out.println("Triangle : "+(0.5*x*y));
            }
        }, 10, 40);

        shapeFactory.printArea((int x, int y) -> {
            System.out.println("Calculating square area : ");
            System.out.println("Square : "+(x+y));
        }, 2, 4);
    }
}
