package com.lms.user_management.service.impl;

import com.lms.user_management.admin.dao.UserRepository;
import com.lms.user_management.admin.model.User;
import com.lms.user_management.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@EnableCaching
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Cacheable("user")
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    @Cacheable("user")
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Cacheable("users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
