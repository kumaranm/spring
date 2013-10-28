package com.mk.cdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mk.cdb.dao.NoteDAO;
import com.mk.cdb.form.Note;

@Service
public class NoteServiceImpl implements NoteService
{

	@Autowired
	private NoteDAO noteDAO;

	@Override
	@Transactional
	public void addNote(Note note)
	{
		noteDAO.addNote(note);
	}

	@Override
	@Transactional
	public List<Note> listNotes()
	{
		return noteDAO.listNotes();
	}

	@Override
	@Transactional
	public void deleteNote(Integer id)
	{
		noteDAO.deleteNote(id);
	}

}
