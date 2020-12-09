package com.sysoiev.book_manager.dao;

import com.sysoiev.book_manager.model.Book;

import java.util.Collection;
import java.util.List;

public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    List<Book> listBooks();

    Book getBooksById(int id);

    void removeBook(int id);

    Collection<Book> getBooks(String search);
}