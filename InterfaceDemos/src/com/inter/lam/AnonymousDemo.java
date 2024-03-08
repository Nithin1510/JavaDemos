package com.inter.lam;

public class AnonymousDemo {
    public static void main(String[] args) {
        IGreeter greeter = new GreeterIMpl();
        greeter.greetMessage("Lamda expressions");

        //Anonymous Inner class
        IGreeter greeter1 = new IGreeter(){

            @Override
            public void greetMessage(String message) {
                System.out.println("Anonymous Inner class");
            }
        };

//        calling the method
        greeter1.greetMessage("Hi");

    }
}
