package com.codefresher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.codefresher.model.Student;
import com.codefresher.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

	// get all user
	@RequestMapping(value = "/listStudent", method = RequestMethod.GET)
	public String getAllUser(Model model) {

		List<Student> rs = studentService.getAllStudent();
		model.addAttribute("student", rs);
		return "/student/listStudent";

	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String addStudent(Model model) {
		model.addAttribute("studentModel", new Student());
		return "/student/addStudent";
	}

	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String setAddStudent (@ModelAttribute(name = "studentModel") Student student){
		studentService.insertStudent(student);
		return "home";
	}

}
