package com.objects.virtualAtm;

public class Current extends Account{

    public Current(double balance) {
        super(balance);
    }

    void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Withdraw successful!");
        }else {
            System.out.println("Enter valid amount!");
        }
    }

    void deposit(double amount){
        super.deposit(amount);
        double minBalance = 5000;
        if(balance < minBalance){
            System.out.println("Minimum balance should be maintained!");
        }
    }
}
