package com.objects.virtualAtm;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial balance : ");
        double balance = sc.nextDouble();
        System.out.println("Select account type Saving or current : ");
        String accountType = sc.next();

    }
}
