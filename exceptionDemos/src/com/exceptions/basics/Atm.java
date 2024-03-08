package com.exceptions.basics;

public class Atm {
    public static void main(String[] args) {
        System.out.println("In ATM");
        Bank bank = new Bank(8000);
        try {
            bank.withdraw(2200);
        }catch (Exception e){
            System.out.println("Exception.....");
        }
        System.out.println("Good bye.....");
    }
}
