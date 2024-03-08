package com.threads.basics;

class Runnab implements Runnable{

    @Override
    public void run() {

    }
}

public class Demo {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("task-1");
        };

        Thread thread = new Thread(task, "Pop");

        Thread thread1 = new Thread(() ->{
            System.out.println("task2");
        }, "top");
        thread.start();
        thread1.start();

    }
}
