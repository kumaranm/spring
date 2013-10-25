package com.mk.cdb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mk.cdb.form.Contact;
import com.mk.cdb.service.ContactService;

@Controller
public class ContactController
{
	@Autowired
	private ContactService contactService;

	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map)
	{
		map.put("contact", new Contact());
		map.put("contactList", contactService.listContacts());

		return "contact";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(Contact contact)
	{
		contactService.addContact(contact);
		return "redirect:/index";
	}

	@RequestMapping(value = "/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer contactId)
	{
		contactService.removeContact(contactId);
		return "redirect:/index";
	}
}
