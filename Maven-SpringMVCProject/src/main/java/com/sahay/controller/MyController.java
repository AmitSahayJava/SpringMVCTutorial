package com.sahay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sahay.model.User;
import com.sahay.service.UserService;

@Controller
public class MyController {
	// Controller Depends on Service
	@Autowired
	private UserService userService;

	@RequestMapping("/") // Means When App is Deployed then Register page will
							// be loaded
	public String getRegister() {
		return "Register";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		userService.save(user);
		return "redirect:/getusers";
	}
	@RequestMapping("/getusers")
	public ModelAndView viewUserList(ModelAndView modelAndView){
		modelAndView.setViewName("UserList");
		List<User> list=userService.viewAll();
		modelAndView.addObject("userList",list);
		return modelAndView;
	}
}
