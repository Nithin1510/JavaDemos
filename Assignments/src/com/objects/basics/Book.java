package com.objects.basics;

public class Book {
    String title;
    String author;
    double price;
    String category;

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void getDetails(){
        System.out.println("Book Name : "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book price : "+price);
        System.out.println("Book category : "+category);
    }

    void checkBookType(){
        if (price > 500){
            System.out.println("Premium book");
        }else{
            System.out.println("Standard book");
        }
    }
}
