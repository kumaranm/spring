package com.mk.cdb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mk.cdb.form.Note;

@Repository
public class NoteDAOImpl implements NoteDAO
{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addNote(Note note)
	{
		sessionFactory.getCurrentSession().save(note);
	}

	@Override
	public List<Note> listNotes()
	{
		return (List<Note>) sessionFactory.getCurrentSession().createQuery("from Note").list();
	}

	@Override
	public void deleteNote(Integer id)
	{
		Note note = (Note) sessionFactory.getCurrentSession().load(Note.class, id);
		if (null != note)
		{
			sessionFactory.getCurrentSession().delete(note);
		}
	}

}
