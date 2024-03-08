package com.exceptions.basics;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome!");
            String value = args[0];
            System.out.println("Value : " + value);
            int num = Integer.parseInt(value);
            int result = 100 / num;
            System.out.println(result);
            int []marks = null;
            System.out.println(marks[0]);
        }catch (NumberFormatException |
                ArrayIndexOutOfBoundsException |
                NullPointerException |
                ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("PLease enter a value ");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue.....");
    }
}
