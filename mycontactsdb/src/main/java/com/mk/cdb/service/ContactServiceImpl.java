package com.mk.cdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mk.cdb.dao.ContactDAO;
import com.mk.cdb.form.Contact;

@Service
public class ContactServiceImpl implements ContactService
{

	@Autowired
	private ContactDAO contactDAO;

	@Override
	@Transactional
	public void addContact(Contact contact)
	{
		contactDAO.addContact(contact);
	}

	@Override
	@Transactional
	public List<Contact> listContacts()
	{
		return contactDAO.listContacts();
	}

	@Override
	@Transactional
	public void removeContact(Integer id)
	{
		contactDAO.removeContact(id);
	}

}
