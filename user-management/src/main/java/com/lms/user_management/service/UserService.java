package com.lms.user_management.service;

import com.lms.user_management.admin.model.User;

import java.util.Optional;

public interface UserService {

    public Optional<User> findById(Integer id);
    public Optional<User> findByEmail(String email);

    User save(User user);
}
