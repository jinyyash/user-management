package com.lms.user_management.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserInput {
    private String email;

    private String password;
}
