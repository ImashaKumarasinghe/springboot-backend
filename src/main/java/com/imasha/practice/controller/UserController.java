package com.imasha.practice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Used to create REST APIs that return JSON/text data
@RequestMapping("api/v1/user") // Base URL
@CrossOrigin // Allows cross-origin requests (frontend → backend)
public class UserController {

    @GetMapping("/getuser")
    public String getUser() {
        return "imasha";
    }

    @PostMapping("/saveuser")
    public String saveUser() {
        return "saved";
    }

    @PutMapping("/updateuser")
    public String updateUser() {
        return "updated";
    }

    @DeleteMapping("/deleteuser")
    public String deleteUser() {
        return "deleted";
    }
}
