package com.lms.user_management.service;

import com.lms.user_management.admin.dao.UserRepository;
import com.lms.user_management.admin.model.User;
import com.lms.user_management.input.LoginUserInput;
import com.lms.user_management.input.RegisterUserInput;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserService userService;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserService userService,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    public User signup(RegisterUserInput input) {
        User user = new User();

                user.setFirstName(input.getFirstname());
                user.setLastName(input.getLastname());
                user.setEmail(input.getEmail());
                user.setPassword(passwordEncoder.encode(input.getPassword()));

        return userService.save(user);
    }

    public User authenticate(LoginUserInput input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userService.findByEmail(input.getEmail())
                .orElseThrow();
    }
}
