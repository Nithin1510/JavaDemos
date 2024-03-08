package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException, NegativeBalanceException {
        System.out.println("In withdraw method");
        try{
            if(balance - amount <= 0)
                throw new OutOfLimitsException("Balance is negative");
            if (amount > 1000)
                throw new NegativeBalanceException("Limit Exceeded");
            balance = balance - amount;
            System.out.println(balance);
        }catch (OutOfLimitsException e){
            System.out.println(e.getMessage());
            throw e;
        }catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("close db");
        }
        System.out.println("Well done");
    }
}
