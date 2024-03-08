package com.exceptions.custom;

import com.exceptions.basics.Bank;

public class VoyaATM {
    public static void main(String[] args) throws OutOfLimitsException, NegativeBalanceException {
        VoyaBank voyaBank = new VoyaBank(2000);
        voyaBank.withdraw(300);
    }
}
