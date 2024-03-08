package com.inter.extend;

public class ScientificCalc extends BasicCalculator implements IScientific {

    @Override
    public void add(int x, int y) {
        System.out.println("Sum : "+(x+y));
    }

    @Override
    public void product(int x, int y) {
        System.out.println("Product : "+(x*y));
    }
    @Override
    public void square(int x) {
        System.out.println("Square of "+x + "is "+Math.pow(x, 2));
    }

    @Override
    public void cube(int x) {
        System.out.println("Cube of "+ x + "is "+ Math.pow(x, 3));
    }
}
