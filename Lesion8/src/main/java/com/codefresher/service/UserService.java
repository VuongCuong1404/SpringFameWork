package com.codefresher.service;

import java.util.List;

import com.codefresher.model.Users;

public interface UserService {
		//getAllUser
	java.util.List<Users> getAllUser();
	
	Users insertUser(Users user);
	
	Users getById(int id);

    Users updateUser(Users user);

	//delete user 
	void deleteUsers(int id);

	//search by username
	List<Users> searchByUserName(String inputSearch);
}
