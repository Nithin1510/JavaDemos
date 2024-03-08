package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,56, 45, 34, 67, 98, 53, 24);

        List<Integer> evenList = new ArrayList<>();

        for (Integer number: numbers){
            if(number % 2 == 0)
                evenList.add(number);
        }

        for(Integer even: evenList){
            System.out.println(even);
        }
        System.out.println(evenList);
    }
}
