package com.inter.extend;

public class Calculator {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();
        calculator.add(12, 34);
        calculator.product(5,50);

        IScientific scientific = new ScientificCalc();
        scientific.square(4);
        scientific.cube(4);
    }
}
