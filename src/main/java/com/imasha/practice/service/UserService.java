package com.imasha.practice.service;

import com.imasha.practice.dto.UserDto;
import com.imasha.practice.entity.User;
import com.imasha.practice.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto , User.class));
        return userDto;
    }
}
