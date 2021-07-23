package com.kashish.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.kashish.sfgdi.service.GreetingService;

@Controller
public class I18nController {

	GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreetings();
	}
}
