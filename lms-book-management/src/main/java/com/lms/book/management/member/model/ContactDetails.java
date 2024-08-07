package com.lms.book.management.member.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactDetails")
public class ContactDetails {

    private Long id;

    private String street;

    private String state;

    private String postalCode;

    private String country;

    private String email;

    private String telephone;
}
