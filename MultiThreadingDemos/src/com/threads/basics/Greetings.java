package com.threads.basics;

public class Greetings {

    public String sayHello(String name){
        String result = null;
        try {
            System.out.println("Hi "+name);
            Thread.sleep(1000);
            result = "Great day "+ name;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
