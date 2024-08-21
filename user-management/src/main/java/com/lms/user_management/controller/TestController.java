package com.lms.user_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("home")
public class TestController {
    @GetMapping
    public String home(){
        return "Hello Home ";
    }

}
