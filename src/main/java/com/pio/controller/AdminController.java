package com.pio.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @DeleteMapping("/admin/delete-user")
    public String deleteUser() {
        return "User deleted successfully";
    }
    @GetMapping("/user/show")
    public String showUser() {
        return "User Details: Madhu";
    }
}
