package com.objects.basics;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(33000);
        System.out.println("Enter your choice withdraw or deposit");
        String choice = sc.next();
        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();


        switch (choice){
            case "withdraw": bank.withdraw(amount);
                break;
            case "deposit": bank.deposit(amount);
                break;
        }

        System.out.println("Balance : "+bank.getBalance());
    }
}
