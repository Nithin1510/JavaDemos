package com.exceptions.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome!");
            String value = "100.000";
            System.out.println("Value : " + value);
            int num = Integer.parseInt(value);
            int result = 100 / num;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Close the connection");
        }
        System.out.println("continue.....");
    }
}
