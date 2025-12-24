package com.imasha.practice.service;

import com.imasha.practice.dto.UserDto;
import com.imasha.practice.entity.User;
import com.imasha.practice.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<UserDto> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDto>>(){}.getType());
    }
    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto,User.class));
        return userDto;

    }

    public Boolean deleteUser(UserDto userDto){
        userRepo.delete(modelMapper.map(userDto,User.class));
        return true;
    }
    //SELECT*FROM USER WHERE=
    public UserDto getUserById(String userId){
        User user=userRepo.getUserById(userId);
          return modelMapper.map(user,UserDto.class);
    }
}
