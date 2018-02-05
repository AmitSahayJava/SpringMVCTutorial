package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {
	@RequestMapping("/user/{userName}/{age}")
   public ModelAndView greeting(@PathVariable String userName,@PathVariable int age){
	   return new ModelAndView("welcomeUser","welcomeMsg","Greeting Sir: Your name is: "+userName+" Age: "+age);
   }
}
