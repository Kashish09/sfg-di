package com.kashish.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.kashish.sfgdi.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("greetingServiceImp") GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
