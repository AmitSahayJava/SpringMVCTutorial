package com.memorynotfound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.memorynotfound.service.HelloWorldService;

@Controller
public class HelloController {
	@Autowired
	private HelloWorldService helloWorldService; 
    @RequestMapping("hello")
	public ModelAndView sayHello(){
		return new ModelAndView("Hello", "myMessage", helloWorldService.sayHello());
	}
}
