package com.codefresher.service.impl;

import java.util.List;

// import org.apache.catalina.User;
// import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.codefresher.model.Users;
import com.codefresher.repository.UserRepository;
import com.codefresher.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		List<Users> rs = userRepository.findAll();
		return rs;
	}
	
	@Override
	public Users insertUser(Users users) {
		return userRepository.save(users);
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		
		return userRepository.getById(id);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUsers(int id) {
		// TODO Auto-generated method stub
		 userRepository.deleteById(id);
	}

	//search 
	@Override
	public List<Users> searchByUserName(String inputSearch) {
		// TODO Auto-generated method stub
		return userRepository.getByUserName(inputSearch);
	}

	
	
	
	
}
