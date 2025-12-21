package com.imasha.practice.controller;

import com.imasha.practice.dto.UserDto;
import com.imasha.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Used to create REST APIs that return JSON/text data
@RequestMapping("api/v1/user") // Base URL
@CrossOrigin // Allows cross-origin requests (frontend → backend)

public class UserController {
    @Autowired
    private  UserService userService;

    @GetMapping("/getuser")
    public String getUser() {
        return "imasha";
    }

    @PostMapping("/saveuser")
    public UserDto saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);


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
