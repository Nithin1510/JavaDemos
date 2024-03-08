package com.oops.statc;

public class Demo {
    static {
        System.out.println("In Demo static block!");
    }
    public static void main(String[] args) {
        System.out.println("main method");

        try {
            Class.forName("com.oops.statc.Trial");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
