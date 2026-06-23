package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.UserService;
import com.example.demo.entity.UserData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/api")
public class ModelController {
    UserService userService;

    public ModelController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/saveUserData")
    public void saveUserData(@RequestBody UserData userData) {
        // Implement the logic to save user data to the database
        userService.saveUserData(userData);
    }

    @GetMapping("/getUserData")
    public List<UserData> getUserData(int userId) {
        // Implement the logic to retrieve user data from the database
        return userService.getAllUserData(); // Replace with actual retrieval logic
    }

    


}
