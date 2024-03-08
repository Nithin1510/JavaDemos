package com.threads.basics;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);

        for(int i = 1 ; i < 10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
