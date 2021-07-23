package com.kashish.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kashish.sfgdi.controller.ConstructorInjectedController;
import com.kashish.sfgdi.controller.I18nController;
import com.kashish.sfgdi.controller.MyController;
import com.kashish.sfgdi.controller.PropertyInjectedController;
import com.kashish.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		
//		String greetings = myController.helloWorld();
		
		System.out.println(myController.helloWorld());
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println("Property: " + propertyInjectedController.getGreetings());
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println("Setter: " + setterInjectedController.getGreetings());
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println("Constructor: "+ constructorInjectedController.getGreetings());
	}

}
