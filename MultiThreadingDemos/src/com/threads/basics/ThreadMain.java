package com.threads.basics;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("Poppy");
        System.out.println(Thread.MIN_PRIORITY+6);
        System.out.println(thread);
        thread.setName("Sam");
        int[] nums = null;
        try{
            System.out.println(nums[0]);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
