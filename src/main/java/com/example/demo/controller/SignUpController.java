package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CUser;

import com.example.demo.UserService;


@RestController
@RequestMapping("/api")
public class SignUpController{
    UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    

    @PostMapping("/signup")
    public String signUp(@RequestBody CUser user) {
        if (userService.userExists(user.getUsername())) {
            return "not-registered";
        }

        userService.registerUser(
                user.getName(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail());

    //    CUser u = userService.getUsers().stream()
     //           .filter(u -> u.getUsername().equals(user.getUsername()))
     //           .findFirst()
     //           .orElse(null);

             return "registered";
}
}
