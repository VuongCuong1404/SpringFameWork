package com.codefresher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefresher.model.Student;
import com.codefresher.model.Users;
import com.codefresher.repository.StudentRepositiry;
import com.codefresher.repository.UserRepository;
import com.codefresher.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepositiry studentRepository;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> rs = studentRepository.findAll();
		return rs;
	}
}
