package com.lms.book.management.borrow.model;

import com.lms.book.management.member.model.Member;
import com.lms.book.management.model.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "borrow")
public class Borrow {

    private Long id;

    private Member member;

    private Book book;

    private LocalDateTime borrowDate;
    private LocalDate dueDate;

    private LocalDateTime datetime;

    private String fine;

    private Status status;
}
