package com.lms.book.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

    private Long id;
    private String name;
    private String description;
}
