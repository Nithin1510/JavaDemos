package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) throws NotEligibleException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your locality : ");
        String locality = sc.next();

        System.out.println("Enter your voterID : ");
        int voterID = sc.nextInt();

        IElectionBoothService electionBoothService = new ElectionBoothServiceImpl();
        try {
            if(electionBoothService.checkEligibility(age,locality,voterID))
                System.out.println("You are eligible to vote");} catch (NotEligibleException e){
            System.out.println(e.getMessage());
        }

    }
}
