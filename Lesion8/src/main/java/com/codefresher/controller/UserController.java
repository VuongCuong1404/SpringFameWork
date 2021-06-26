package com.codefresher.controller;

import java.util.List;

// import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codefresher.model.Users;
import com.codefresher.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userServie;

	// get all
	// @RequestMapping(value = "/listUser", method = RequestMethod.GET)
	// public String getAllUser(Model model) {

	// 	List<Users> rs = userServie.getAllUser();
	// 	model.addAttribute("users", rs);
	// 	return "/user/listUser";
	// }

	// search username
	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	public String searchUser(Model model, @RequestParam(name = "searchInput", required = false) String search) {

		if (search == null) {
			search = "";
		}

		List<Users> rs = userServie.searchByUserName(search);
		model.addAttribute("users", rs);
		return "/user/listUser";
	}

	// create User
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String showAddUser(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("userModel", new Users());
		return "/user/addUser";

	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String doAddUser(@ModelAttribute(name = "userModel") Users user) {
		// TODO Auto-generated method stub
		userServie.insertUser(user);
		return "home";

	}

	// get user by id
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getUserById(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("user", userServie.getById(id));
		return "/user/userDetail";
	}

	// update user by Id
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
	public String showUpdateUser(Model model, @PathVariable("id") int id) {
		model.addAttribute("updateModel", userServie.getById(id));
		return "/user/updateUser";

	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public String editUser(@ModelAttribute("updateModel") Users user) {
		userServie.updateUser(user);
		return "redirect:home";
	}

	// delete User
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public String deleteUSer(@PathVariable("id") int id) {
		userServie.deleteUsers(id);
		return "home";
	}

}
