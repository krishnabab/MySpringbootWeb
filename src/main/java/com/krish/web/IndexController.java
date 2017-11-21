package com.krish.web;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krish.Circle;
import com.krish.ObjectShape;
 
@Controller
public class IndexController {
	
	//@Autowired
	ApplicationContext context;
	
	@Autowired
	// pickup the triangleInstance bean id to be a qualifies here
	//@Qualifier("triangleInstance")
	ObjectShape circleInstance;
	
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
    	//ObjectShape obj = context.getBean(Circle.class);
        model.put("message", "testtt");
        circleInstance.area();
        return "index";
    }
    
    @PostConstruct
    public void checkPostConstruct()
    {
    	circleInstance.area();
    }
     
    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
    
	public void setContext(@Autowired ApplicationContext applicationContext) {
		context = applicationContext;
	}
 
}