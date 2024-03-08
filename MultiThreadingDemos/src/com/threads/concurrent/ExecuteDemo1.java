package com.threads.concurrent;

import com.threads.basics.Booking;
import com.threads.basics.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //create independent tasks
        executorService.execute(() ->{
            System.out.println("Doing pooling");
            Greetings greet = new Greetings();
            greet.sayHello("Nithin");
        });

        executorService.execute(() -> {
            System.out.println("Extracting name for url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Nithin", 10));
        });

        executorService.execute(() -> { System.out.println("Reading from DB...");});

        executorService.shutdown();
    }
}
