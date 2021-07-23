package com.kashish.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.kashish.sfgdi.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("greetingServiceImp")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
