package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CUser;
import com.example.demo.entity.UserData;
import com.example.demo.UserService;


@RestController
@RequestMapping("/SignUpApi")
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

        userService.registerUser(user);
       
             return "registered";
}

    @PostMapping("/saveUserData/{id}")
    public void saveUserData(@RequestBody UserData userData, @PathVariable int id) {
        // Implement the logic to save user data to the database
        userService.saveUserData(userData,id);
        System.out.println("Controller reached");
        System.out.println("ID = " + id);
        System.out.println("Salary = " + userData.getMontlySalary());
    }
}
