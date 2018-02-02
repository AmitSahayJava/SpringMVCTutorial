package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/hellomsg")
	public ModelAndView greeting(){
		return new ModelAndView("hello","message","Hello World By Spring MVC");
	}
    
    @RequestMapping("/")
    public String home(){
    	return "Home";
    }
}
