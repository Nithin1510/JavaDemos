package com.objects.basics;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Bahubalu","Rajendra Prasad", 678, "fiction");
        book.getDetails();
        book.checkBookType();

        System.out.println();

        Book book1 = new Book("Virupaksha","Gopi",499, "Fiction");
        book1.getDetails();
        book1.checkBookType();
    }
}
