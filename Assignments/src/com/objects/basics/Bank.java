package com.objects.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
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
        balance += amount;
        System.out.println("Deposit successful!");
    }

    double getBalance(){
        return balance;
    }
}
