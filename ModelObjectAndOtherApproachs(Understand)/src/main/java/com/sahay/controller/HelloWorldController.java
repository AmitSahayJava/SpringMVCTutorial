package com.sahay.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    //---------------------------Approach 1---------------
	@RequestMapping("/")
	public String helloMessage(Model model){
		model.addAttribute("message1", "Welcome To Spring MVC");
		model.addAttribute("message2","Have a Nice Day");
		return "HomePage";
	}
	//--------------------------Approach 2----------------
	@RequestMapping("/product")
	public String productPage(Map<String,String> map){
		map.put("movie", "Padmavati 2018");
		map.put("Book", "HeadFirst Series");
		return "ProductPage";
	}
	//-------------------------Approach 3------------------
	@RequestMapping("/cart")
	public String cartPage(){
		return "CartPage";
	}
	@ModelAttribute
	public void objects(Model model){
		model.addAttribute("sports","WWE");
		model.addAttribute("movie","New Movies");
	}
}
