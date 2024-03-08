package com.threads.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=10;i++) {
            //pass the implementation of runnable using lambda
            executorService.execute(() -> {
                System.out.println("Doing task......  ");
            });

        }
        executorService.shutdown();
    }
}
