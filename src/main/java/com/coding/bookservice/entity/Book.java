package com.coding.bookservice.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "t_book")
@Component
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private BigDecimal price;
    @Column
    private String icon;

}
