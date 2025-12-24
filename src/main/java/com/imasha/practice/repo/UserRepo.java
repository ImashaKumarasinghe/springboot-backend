package com.imasha.practice.repo;

import com.imasha.practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT*FROM USER WHERE=?1")
    User getUserById(String userId);

}
