package com.inter.lam;

public class GreeterIMpl implements IGreeter{


    @Override
    public void greetMessage(String message) {
        System.out.println("Welcome "+ message + " !");
    }
}
