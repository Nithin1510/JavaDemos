package com.inter.lam;

public class LambdaDemo {
    public static void main(String[] args) {

        //implementing using lambda expression
        IGreeter greeter = (String message) -> {
            System.out.println("HEllo Lambda"+message);
        };

        //calling
        greeter.greetMessage("Hi");

        IGreeter greeter1 = message -> System.out.println("Message "+message);
        greeter1.greetMessage("WOW");
    }
}
