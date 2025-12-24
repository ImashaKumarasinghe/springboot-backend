package com.imasha.practice.controller;

import com.imasha.practice.dto.UserDto;
import com.imasha.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Used to create REST APIs that return JSON/text data
@RequestMapping("api/v1/user") // Base URL
@CrossOrigin // Allows cross-origin requests (frontend → backend)

public class UserController {
    @Autowired
    private  UserService userService;

    @GetMapping("/getusers")
    public List<UserDto> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveuser")
    public UserDto saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);


    }

    @PutMapping("/updateuser")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/deleteuser")
    public Boolean deleteUser(@RequestBody UserDto userDto) {
        return userService.deleteUser(userDto);

    }
    //SELECT*FROM USER WHERE=getuser by id
    @GetMapping("/getUserByUserId/{userId}")
    public UserDto getUserByUserId(@PathVariable Integer userId){
       return userService.getUserByUserId(userId);
    }



}
