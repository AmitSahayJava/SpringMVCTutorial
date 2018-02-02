package com.memorynotfound.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
   public String sayHello(){
	   return "Spring MVC Says Hello To all Users";
   }
}
