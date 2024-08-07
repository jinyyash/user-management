package com.lms.book.management.member.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name ="member")
public class Member {
    private Long id;
    private String firstName;
    private String lastName;
    private String MembershipType;

    private LocalDate joinedDate;

    private ContactDetails contactDetails;


}
