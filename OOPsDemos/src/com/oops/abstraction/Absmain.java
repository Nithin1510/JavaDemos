package com.oops.abstraction;

public class Absmain {
    public static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.housingLoan();
        bank.eduLoan();
        Branch1 branch1 = (Branch1) bank;
        branch1.staffDetails();


        bank = new SubBranch();
        SubBranch subBranch = (SubBranch)bank;
        subBranch.carLoan();
        subBranch.loanType();
        subBranch.subpay();
    }
}
