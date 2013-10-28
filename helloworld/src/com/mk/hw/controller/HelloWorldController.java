package com.mk.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController
{
	private String viewName = "hello";
	private String key = "message";

	@RequestMapping("/hello")
	public ModelAndView hellowWorld()
	{
		String message = "Hello World, Spring 3.0!";
		System.out.println("Hello World");
		return new ModelAndView(viewName, key, message);
	}
}
