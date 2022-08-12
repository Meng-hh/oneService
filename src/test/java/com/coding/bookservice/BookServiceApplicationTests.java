package com.coding.bookservice;


import com.coding.bookservice.entity.Book;
import com.coding.bookservice.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class BookServiceApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private Book book;

    @Test
    void contextLoads() {
        book.setName("百年孤独");
        book.setPrice(BigDecimal.valueOf(200L));
        bookMapper.save(book);
    }

}
