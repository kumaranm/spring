package com.mk.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mk.hw.model.MyContact;

@Controller
public class MyContactController
{
	@RequestMapping(value="/addMyContact", method=RequestMethod.POST)
	public String addMyContact(MyContact contact)
	{
		System.out.println(contact.getName());
		System.out.println(contact.getMobile());
		return "redirect:mycontacts.html";
	}
	
	@RequestMapping("/mycontacts")
	public ModelAndView myContacts()
	{
		/*
		 * MyContact object is binded to the form and passed when the form submit happens
		 * */
		return new ModelAndView("mycontact", "command", new MyContact());
	}
}
