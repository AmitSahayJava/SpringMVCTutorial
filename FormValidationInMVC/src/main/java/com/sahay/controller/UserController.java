package com.sahay.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sahay.model.User;

@Controller
public class UserController {
	@RequestMapping("/")
   public String getForm(){
	   return "UserRegistration";
   }
	@RequestMapping(value="/formdata", method=RequestMethod.POST)
	public String getFormData(@Valid @ModelAttribute("user") User u,BindingResult ressult ){
		if(ressult.hasErrors()){
			return "UserRegistration";
		}
		return "UserInfo";
	}
	
}
