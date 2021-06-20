package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefresher.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
	

}
