package com.threads.basics;

class Runner implements Runnable{

    String name;

    Greetings greetings;

    public Runner(String name, Greetings greetings) {
        Thread thread = new Thread(this, name);
        this.name = name;
        this.greetings = greetings;
        thread.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("Done");
        }
    }
}

public class RunThread {
    public static void main(String[] args) {
//        Runner runner = new Runner();
//        Thread thread = new Thread(runner, "Thread-one");
//        Thread thread1 = new Thread(runner, "Thread-two");
//        Thread thread2 = new Thread(runner, "Thread-three");
//        thread.start();
//        thread1.start();
//        thread2.start();
        Greetings greetings = new Greetings();
        Runner runner = new Runner("Ram", greetings);
        Runner runner1 = new Runner("Sita", greetings);
        Runner runner2 = new Runner("Laxman", greetings);
        Runner runner3 = new Runner("Bharat", greetings);
    }
}
