package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	@GetMapping("/signup")
	public String page() {
		System.out.println("WelcomeController.greeting()");
		return "sign-up";
	}
	
	
	@PostMapping("/signupUser")
	public String signUp(@RequestParam(name = "username") String name,@RequestParam(name = "department")String department,@RequestParam(name = "address")String address,Model model) {
		System.out.println("WelcomeController.signup: "+name);
		System.out.println("WelcomeController.signup: "+department);
		System.out.println("WelcomeController.signup: "+address);
		model.addAttribute("name", name);
		model.addAttribute("department", department);
		model.addAttribute("address", address);
		return "success";
	}
	

	@GetMapping("/req-param")
	public String createUser(@RequestParam(name = "user") String name, Model model) {
		
		model.addAttribute("user", name);

		System.out.println("WelcomeController.greeting :" + name);

		return "success";
	}

}
