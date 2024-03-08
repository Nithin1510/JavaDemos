package com.threads.basics;

class Child extends Thread{

    public Child(String name, int priority){
        super(name);
        System.out.println(this);
        this.start();
    }

    //this is the CPU
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i)+" " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExThread {

    public static void main(String[] args) {

//        Child child1 = new Child("Thread-1", 10);
//        Child child2 = new Child("Thread-2", 6);
        Child child3 = new Child("Thread-3", 8);
//        child3.setDaemon(true);
//        child3.start();

        for(int i=1;i<=10;i++){
            String name = Thread.currentThread().getName();
            System.out.println("10 * "+i+" = "+(10*i)+" " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        try {
//            child1.join();
//            child2.join();
//            child3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Main completed");
    }
}
