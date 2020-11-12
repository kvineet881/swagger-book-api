package com.example.springswaager.controller;

import com.example.springswaager.model.Book;
import com.example.springswaager.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@Api(value = "book service",description = "My Book Store")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/save")
    @ApiOperation(value = "save book api")
    public String saveBook(@RequestBody Book book) {

        return service.saveBok(book);
    }

    @GetMapping("/getbook/{bookId}")
    @ApiOperation(value = "get book api")
    public Optional<Book> getBook(@PathVariable int bookId) {
        return service.getBook(bookId);
    }

    @DeleteMapping("deletebook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId) {
        return service.removeBook(bookId);
    }

}
