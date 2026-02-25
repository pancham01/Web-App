package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
//	@RequestMapping(value = "/login" , method =  RequestMethod.GET)
	@GetMapping("/")
	public String greeting()
	{
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	
	@GetMapping("/sign-up")
	public String createUser()
	{
		System.out.println("WelcomeController.greeting()");
		return "success";
	}

}


