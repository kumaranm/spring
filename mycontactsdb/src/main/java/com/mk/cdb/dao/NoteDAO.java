package com.mk.cdb.dao;

import java.util.List;

import com.mk.cdb.form.Note;

public interface NoteDAO
{
	public void addNote(Note note);

	public List<Note> listNotes();

	public void deleteNote(Integer id);
}
