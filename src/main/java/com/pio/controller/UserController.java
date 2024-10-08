package com.pio.controller;

import com.pio.model.User;
import com.pio.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private MyUserService myUserService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return myUserService.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return myUserService.verify(user);
    }
}
