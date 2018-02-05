package com.sahay.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sahay.model.User;
import com.sahay.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
    public String registerPage(){
    	return "Register";
    }
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){
		service.add(user);
		
		return "redirect:/getusers";
	}
	@RequestMapping(value = "/getusers")
	public ModelAndView getListOfUsers(ModelAndView modelAndView) {//Spring is creating it
		        
		modelAndView.setViewName("UserList");
		List<User> list = service.getAllUser();
		modelAndView.addObject("userList", list);
		return modelAndView;
	}
}
