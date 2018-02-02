package com.memorynotfound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.memorynotfound.service.HelloService2;
import com.memorynotfound.service.HelloWorldService;

@Controller
public class HelloController {
	@Autowired
	private HelloWorldService helloWorldService; 
	@Autowired
	private HelloService2 helloService2;
    @RequestMapping("hello")
	public ModelAndView sayHello(){
		return new ModelAndView("Hello", "myMessage", helloWorldService.sayHello());
	}
    
    @RequestMapping(value="/developer", method=RequestMethod.GET)
    public ModelAndView developedBy(){
    	return new ModelAndView("Hello", "developerName", helloService2.message() );
    }
}
