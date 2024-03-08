package com.oops.abstraction;

public abstract class Branch2 extends Bank{

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

    void loanType(){
        System.out.println("Easy EMI loans in Branch-2");
    }
}
