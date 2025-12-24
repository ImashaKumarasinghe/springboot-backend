package com.imasha.practice.repo;

import com.imasha.practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    //?1 is first parameter ?1 refers to userId 1 means position number?2 would mean the second parameter, and so on
    @Query(value = "SELECT*FROM USER WHERE=?1")
    User getUserByUserId(String userId);

}
