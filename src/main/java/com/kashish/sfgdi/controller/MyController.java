package com.kashish.sfgdi.controller;

import org.springframework.stereotype.Controller;

import com.kashish.sfgdi.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;

	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String helloWorld() {
		
//		System.out.println("helloWorld method");
		return greetingService.sayGreetings();
	}
}
