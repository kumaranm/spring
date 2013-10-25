package com.mk.cdb.service;

import java.util.List;

import com.mk.cdb.form.Contact;

public interface ContactService
{
	public void addContact(Contact contact);

	public List<Contact> listContacts();

	public void removeContact(Integer id);
}
