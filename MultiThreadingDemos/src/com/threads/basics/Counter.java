package com.threads.basics;

public class Counter implements  Runnable{
    String  name;
    int noOfTickets;
    Booking booking;

    public Counter(String name, int noOfTickets, Booking booking) {
        super();
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        Thread thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (booking) {
            System.out.println("Welcome to Prasad Theater "+name);
            double amount = booking.bookTickets(name, noOfTickets);
            System.out.println("Amount to be paid : "+amount);
        }
    }
}
