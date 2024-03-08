package com.list.custom;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book("Avengers", "AntMan", 999.0),
                new Book("Java", "Kathy", 654),
                new Book("Java", "Kathy", 654),
                new Book("Spring", "Robin", 900),
                new Book("Leadership", "Kathy", 1900),
                new Book("Servlets", "Kathy", 900));

        System.out.println("Books List........");
        for(Book book: books){
            System.out.println(book);
        }

        System.out.println();

        Set <Book> bookSet = new LinkedHashSet<>(books);

        System.out.println("Books Set.....");
        for(Book book: bookSet){
            System.out.println(book);
        }
    }
}
