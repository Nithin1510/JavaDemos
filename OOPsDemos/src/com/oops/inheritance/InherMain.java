package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Nithin", 10);
        inEmployee.getDetails();

        InManager inManager = new InManager("Vikram", 345453, 450000);
        inManager.getDetails();
        inManager.printBonus(2300);
    }
}
