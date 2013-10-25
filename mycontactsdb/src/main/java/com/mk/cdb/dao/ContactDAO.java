package com.mk.cdb.dao;

import java.util.List;

import com.mk.cdb.form.Contact;

public interface ContactDAO
{
	public void addContact(Contact contact);

	public List<Contact> listContacts();

	public void removeContact(Integer Id);
}
