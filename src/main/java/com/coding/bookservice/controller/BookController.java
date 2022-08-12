package com.coding.bookservice.controller;

import com.coding.bookservice.entity.Book;
import com.coding.bookservice.service.BookService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Book> books(){
        val books = (List<Book>) bookService.findAllBooks();
        System.out.println(books.stream().findFirst());
        return books;
    }
}
