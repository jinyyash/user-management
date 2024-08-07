package com.lms.user_management.input;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserInput
{
    private String email;

    private String password;

    private String firstname;
    private String lastname;

}
