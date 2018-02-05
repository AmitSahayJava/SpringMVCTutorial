package com.sahay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserInputController {
   // @RequestMapping("/{userName}/{email}")
	public ModelAndView inputTaket(@PathVariable String userName, @PathVariable String email){
		String userdata=userName+"  "+email;
    	return new ModelAndView("UserInfo","data",userdata);
	}
    
    @RequestMapping("/{userName}/{email:.+}")//By using Regular Expression we fix this problem
	public ModelAndView inputAllTaket(@PathVariable String userName, @PathVariable String email){
		String userdata=userName+"  "+email;
    	return new ModelAndView("UserInfo","data",userdata);
	}
}

//Now Pass this input:  http://localhost:8080/PathVariableConcept2/user/amit/a.sahayji@gmail.com