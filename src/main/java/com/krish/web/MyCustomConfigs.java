package com.krish.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.krish.Circle;
import com.krish.ObjectShape;
import com.krish.Triangle;

@Configuration
public class MyCustomConfigs {
	
	// method name will be used to provide beanid . For Ex circleInstance below is beanid
	@Bean
	//@Scope("prototype")
	//To define which is primary bean among ObjectShape 
	@Primary
	public ObjectShape circleInstance() {
		 return new Circle();
	}
	
	@Bean
	public ObjectShape triangleInstance() {
		 return new Triangle();
	}

}
