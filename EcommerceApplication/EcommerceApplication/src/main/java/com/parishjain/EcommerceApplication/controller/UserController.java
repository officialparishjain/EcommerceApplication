package com.parishjain.EcommerceApplication.controller;


import com.parishjain.EcommerceApplication.models.User;
import com.parishjain.EcommerceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/create")
    public String createUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
