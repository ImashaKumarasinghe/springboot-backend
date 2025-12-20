package com.imasha.practice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController // used to create REST APIs that return JSON / text data
@RequestMapping(value = "api/v1/user") // base URL mapping
@CrossOrigin // allows cross-origin requests
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
    public String updateUser(){
        return "edit";
    }
    @DeleteMapping("/deleteuser")

    public String deleteUser(){
        return("delete");
    }
}

