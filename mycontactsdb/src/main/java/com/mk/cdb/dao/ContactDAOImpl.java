package com.mk.cdb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mk.cdb.form.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO
{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addContact(Contact contact)
	{
		sessionFactory.getCurrentSession().save(contact);
	}

	@Override
	public List<Contact> listContacts()
	{
		return (List<Contact>)sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	@Override
	public void removeContact(Integer id)
	{
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
		if (null != contact)
		{
			sessionFactory.getCurrentSession().delete(contact);
		}

	}
}
