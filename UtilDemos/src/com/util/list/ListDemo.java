package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        System.out.println(list.size());
        list.add("Java");
        list.add("100.9");
        list.add("Spring");
        list.add("Maven");
        System.out.println(list);
        list.add(1, "Helen");
        list.add("345");
        System.out.println(list);
        list.set(2, "Nithin");

        Iterator<String> iterator = list.iterator();
        System.out.println(list);
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println();
        ListIterator <String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }

        System.out.println();

        System.out.println("Sorting the list.....");
        Collections.sort(list);
        for (String val: list){
            System.out.println(val.toUpperCase());
        }

    }
}
