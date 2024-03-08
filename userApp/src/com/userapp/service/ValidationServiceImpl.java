package com.userapp.service;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.exception.NameExistsException;

public class ValidationServiceImpl implements IValidationService {

    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException{
        if (password.length() < 6){
            System.out.println("Password too short");
            throw new TooShortException("Too Short Password");
            }
        else if(password.length() >= 15){
            System.out.println("Password too long");
            throw new TooLongException("Too long Exception");
        }
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws  NameExistsException{
        String []usernames = {"nithin", "kumar", "reddy", "chandu"};
        for(String user: usernames){
            if(username.equals(user)){
//                System.out.println("username already exists");

                throw new NameExistsException("Username exists");
            }
        }
        return true;
    }
}
