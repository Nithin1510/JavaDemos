package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {
    @Override
    public List<Book> getAll() {
        List <Book> books = BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List <Book> books = BookDetails.showBooks();
        List <Book> booksByAuthor = new ArrayList<>();

        for(Book book: books){
            if (book.getAuthor().toLowerCase().startsWith(author))
                booksByAuthor.add(book);
        }
        if(booksByAuthor.isEmpty())
            throw new BookNotFoundException("Book not found matching "+author+" Author");
        return booksByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List <Book> books = BookDetails.showBooks();
        List <Book> booksByCategory = new ArrayList<>();

        for(Book book: books){
            if (book.getCategory().equals(category))
                booksByCategory.add(book);
        }
        if(booksByCategory.isEmpty())
            throw new BookNotFoundException("Book not found matching "+category+" category");
        return booksByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List <Book> books = BookDetails.showBooks();
        List <Book> booksByPrice = new ArrayList<>();

        for(Book book: books){
            if (book.getPrice() < price)
                booksByPrice.add(book);
        }
        if(booksByPrice.isEmpty())
            throw new BookNotFoundException("Book not found matching "+price+" Price");
        return booksByPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List <Book> books = BookDetails.showBooks();
        List <Book> booksByAuthorAndCategory = new ArrayList<>();

        for(Book book: books){
            if ((book.getAuthor().contains(author)) && (book.getCategory().contains(category)))
                booksByAuthorAndCategory.add(book);
        }
        if(booksByAuthorAndCategory.isEmpty())
            throw new BookNotFoundException("Book not found matching "+author+" author and "+category+" Category");
        return booksByAuthorAndCategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List <Book> books = BookDetails.showBooks();
        for(Book book: books){
            if (book.getBookId() == bookId){
                return book;
            }
        }
        throw new IdNotFoundException("BookId not found matching "+bookId+" BookId.");
    }
}
