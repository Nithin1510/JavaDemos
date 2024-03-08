package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {

        IMyCalculator myCalculator = (int x, int y) -> {
            return x+y;
        };
        System.out.println("Sum : "+myCalculator.calculate(9,6));

        myCalculator = (int x, int y) -> x-y;
        System.out.println("Subtraction : "+myCalculator.calculate(9, 6));

        myCalculator = (int x, int y) -> x*y;
        System.out.println("Multiplication : "+myCalculator.calculate(9, 6));

        myCalculator = (int x, int y) -> x/y;
        System.out.println("Division : " +myCalculator.calculate(9, 6));
    }
}
