package com.kashish.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kashish.sfgdi.service.GreetingServiceImp;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	private void setUp() {
		// TODO Auto-generated method stub
		controller = new PropertyInjectedController();
		
		controller.greetingService = new GreetingServiceImp();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreetings());
	}

}
