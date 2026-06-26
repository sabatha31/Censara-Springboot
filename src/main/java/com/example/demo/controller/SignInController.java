package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CUser;

import com.example.demo.LoginRequest;
import com.example.demo.UserService;

 

@RestController
@RequestMapping("/SignInApi")
public class SignInController {
    UserService userService;

    public SignInController(@RequestBody UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public List<CUser> getUsers(){
        return userService.getUsers();

    }

    @PostMapping("/signin")
public String signIn(@RequestBody LoginRequest request) {

    boolean verify = userService.signInUser(
            request.getUsername(),
            request.getPassword());

    if(verify){
        return "passed";
    } 
    else {
        return "failed";
    }


}
}

