package com.platzi.springboot.controller;

import com.platzi.springboot.entity.User;
import com.platzi.springboot.services.UserService;
import com.platzi.springboot.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/")
    List<User> get(){
        return userServiceImpl.getAllUsers();
    }
}
