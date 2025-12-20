package com.imasha.practice.controller;

import org.springframework.web.bind.annotation.*;

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

