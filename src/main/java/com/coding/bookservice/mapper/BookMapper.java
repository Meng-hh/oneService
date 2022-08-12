package com.coding.bookservice.mapper;


import com.coding.bookservice.entity.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookMapper extends CrudRepository<Book,Long> {
}
