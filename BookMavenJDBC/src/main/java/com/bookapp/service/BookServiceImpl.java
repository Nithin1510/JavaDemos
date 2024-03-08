package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

public class BookServiceImpl implements IBookService {

    private IBookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    @Override
    public void updateBook(int bookId, double price) {
        bookRepository.updateBook(bookId, price);
    }

    @Override
    public void deleteBook(int bookId) {
        bookRepository.deleteBook(bookId);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthorStartsWith(String author) throws BookNotFoundException {
        bookRepository.findByAuthorStartsWith(author);
        return null;
    }

    @Override
    public List<Book> findByCategory(String category) throws BookNotFoundException {

        return null;
    }

    @Override
    public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public Book findById(int bookId) throws IdNotFoundException {
        return null;
    }
}
