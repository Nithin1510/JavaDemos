package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        IValidationService validationService = new ValidationServiceImpl();
        try{
            System.out.println("Enter username : ");
            String username = sc.next();
            if(validationService.validateUsername(username)){
                System.out.println("Enter password : ");
                String password = sc.next();
                if(validationService.validatePassword(password)){
                    System.out.println("Login Successful");
                }
            }
        }catch (NameExistsException e){
            System.out.println(e.getMessage());
        }catch (TooLongException e){
            System.out.println(e.getMessage());
        }catch (TooShortException e){
            System.out.println(e.getMessage());
        }
    }
}
