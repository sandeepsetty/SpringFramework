package com.sandeep.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       // AbstractApplicationContext context = new ClassPathXmlApplicationContext("Default-init-Beans.xml");
	  HelloWorld objA = (HelloWorld)context.getBean("helloworld");
	  objA.setMessage("Hello World java");
	  objA.getMessage();
	  
	  context.registerShutdownHook();
	
	
	}

}
