package com.example.springswaager.service;

import com.example.springswaager.dao.BookRepository;
import com.example.springswaager.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public String saveBok(Book book)
    {
        repository.save(book);
        return "Book saved with id :"+book.getBookId();
    }

    public Optional<Book> getBook(int bookId)
    {
        return repository.findById(bookId);
    }
    public List<Book> removeBook(int bookId)
    {
        repository.deleteById(bookId);
        return repository.findAll();
    }

}
