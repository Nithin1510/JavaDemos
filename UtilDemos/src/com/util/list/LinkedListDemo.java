package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Spring");
        linkedList.add("NodeJS");
        linkedList.add("Angular");
        linkedList.add("Maven");
        System.out.println(linkedList);
        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("React");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));

        System.out.println();

        Iterator <String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String val = iterator.next();
            System.out.println(val);
        }
    }
}
