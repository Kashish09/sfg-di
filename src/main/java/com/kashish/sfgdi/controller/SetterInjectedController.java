package com.kashish.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kashish.sfgdi.service.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	@Autowired
	public void setgreetingService(GreetingService greetingService) {
		
		this.greetingService = greetingService;
		
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
