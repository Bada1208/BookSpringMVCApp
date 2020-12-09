package com.sysoiev.book_manager.service.impl;

import java.util.Collection;
import java.util.List;

import com.sysoiev.book_manager.dao.BookDao;
import com.sysoiev.book_manager.model.Book;
import com.sysoiev.book_manager.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }

    @Override
    @Transactional
    public Book getBooksById(int id) {
        return this.bookDao.getBooksById(id);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Collection<Book> getBooks(String search) {
        return this.bookDao.getBooks(search);
    }
}
