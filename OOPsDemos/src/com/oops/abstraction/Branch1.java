package com.oops.abstraction;

public class Branch1 extends Bank{

    @Override
    void carLoan() {
        System.out.println("Car Loan in Branch-1");
    }

    @Override
    void housingLoan() {
        System.out.println("House Loan in Branch-1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education Loan in Branch-1");
    }

    void staffDetails(){
        System.out.println("Staff in Branch-1");
    }
}
