package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;
import com.example.demo.entity.CUser;
import com.example.demo.entity.UserData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/Modelapi")
public class ModelController {
    UserService userService;

    public ModelController(UserService userService) {
        this.userService = userService;
    }
    

    @GetMapping("/getUserData")
    public List<UserData> getAllUserData() {
        // Implement the logic to retrieve user data from the database
        return userService.getAllUserData(); // Replace with actual retrieval logic
    }

    @GetMapping("/getUserByUsername/{username}")
    public CUser getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/getUsers")
    public List<CUser> getUsers(){
        return userService.getUsers();

    }

    @GetMapping("/getUserById/{id}")
    public UserData getUserDataById(@PathVariable int id) {
        return userService.getUserDataById(id);
    }
}
