package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor"))
            System.out.println("Chess and TT are available.");
        else
            System.out.println("Cricket");
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly lunch outing");
    }
}
