package com.oops.statc;
import  static com.oops.statc.Trial.getMessage;

public class Sample {
    public static void main(String[] args) {
        System.out.println("in sample");
        int x=10,y=20;
        getMessage();
        System.out.println(x+y);
//        System.out.println(Trial.x+Trial.y);
    }
}
