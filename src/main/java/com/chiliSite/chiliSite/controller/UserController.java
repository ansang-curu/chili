package com.chiliSite.chiliSite.controller;

import com.chiliSite.chiliSite.model.User;
import com.chiliSite.chiliSite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        System.out.println(userService.getAllUsers().toString());
        return userService.getAllUsers();
    }

}