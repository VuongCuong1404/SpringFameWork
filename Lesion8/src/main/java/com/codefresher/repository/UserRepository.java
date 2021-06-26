package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.codefresher.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query(value = "select * from users where like %?1%",nativeQuery = true)
    List<Users>getByUserName(String search);
    // List<Users>search(String search);

}
