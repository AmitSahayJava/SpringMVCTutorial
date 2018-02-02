package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping("/products")
	public ModelAndView products() {
		return new ModelAndView("Product", "listOfProducts", "All Products");
	}
}
