package com.imasha.practice.repo;

import com.imasha.practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
