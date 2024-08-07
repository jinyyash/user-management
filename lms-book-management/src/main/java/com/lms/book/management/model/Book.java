package com.lms.book.management.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "book")
public class Book {

    private Long id;
    private String name;

    private String isbn;

    private String title;

    private String author;

    private String publisher;

    private String remark;

    //available status
    //created by
    // updated by


    private LocalDateTime created;
    private LocalDateTime updated;


}
