package com.objects.virtualAtm;

public class Savings extends Account{
    public Savings(double balance) {
        super(balance);
    }

    void withdraw(double amount){
        double minBalance = 1000;
        if( balance- amount < minBalance){
            System.out.println("Minimum balance should be maintained!");
        }else {
            super.withdraw(amount);
        }
    }

    void deposit(double amount){
        super.deposit(amount);
    }
}
