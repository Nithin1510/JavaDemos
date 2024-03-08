package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book("Avengers", "AntMan", 999.0),
                new Book("Java", "Kathy", 654),
                new Book("Spring", "Robin", 900),
                new Book("Leadership", "Kathy", 1900),
                new Book("Servlets", "Kathy", 900));

        System.out.println("Before comparing.......");
        for (Book book: books){
            System.out.println(book);
        }

        System.out.println();
        System.out.println("After sorting .......");
        Collections.sort(books);
        for (Book book: books){
            System.out.println(book);
        }
    }
}
