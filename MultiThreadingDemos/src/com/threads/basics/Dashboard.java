package com.threads.basics;

public class Dashboard {
    public static void main(String[] args) {

        Booking booking = new Booking();

        Counter counter1 = new Counter("Tom", 10, booking);
        Counter counter2 = new Counter("John", 5, booking);
        Counter counter3 = new Counter("Sam", 3, booking);
    }
}
