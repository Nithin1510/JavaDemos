package com.exceptions.basics;

public class BasicException {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome!");
            String value =  "100";
            System.out.println("Value : " + value);
            int num = Integer.parseInt(value);
            int result = 100 / num;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue.....");
    }
}
