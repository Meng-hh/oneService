package com.coding.bookservice.service;

import com.coding.bookservice.entity.Book;
import com.coding.bookservice.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public Iterable<Book> findAllBooks(){
        return bookMapper.findAll();
    }

}
