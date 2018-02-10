package com.sahay.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sahay.model.User;
import com.sahay.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
   public String getForm(){
	   return "UserForm";
   }
	@RequestMapping(value="/userdatacontroller",method=RequestMethod.POST)
	public String getUserData(@Valid @ModelAttribute("userData") User user, BindingResult result){
		if(result.hasErrors()){
			return "UserForm";
		}
		else{
			userService.saveUser(user);
		}
		
		
		return "UserInfo";
	}
	@RequestMapping("/getAllUserList")
	public String viewAllUser(Model model){
		
		List list=userService.getAllUser();
		model.addAttribute("userListObject",list);
		return "UserList";
	}
}
