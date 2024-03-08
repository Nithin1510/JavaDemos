package com.oops.abstraction;

public class SubBranch extends Branch2{

    @Override
    void carLoan() {
        System.out.println("SubBranch provides car loan.");
    }

    void subpay(){
        System.out.println("Payment in subBranch");
    }
}
