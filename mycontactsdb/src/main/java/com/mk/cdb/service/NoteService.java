package com.mk.cdb.service;

import java.util.List;

import com.mk.cdb.form.Note;

public interface NoteService
{
	public void addNote(Note note);

	public List<Note> listNotes();

	public void deleteNote(Integer id);
}
