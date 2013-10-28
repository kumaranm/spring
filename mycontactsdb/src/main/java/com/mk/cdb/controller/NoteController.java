package com.mk.cdb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mk.cdb.form.Note;
import com.mk.cdb.service.NoteService;

@Controller
public class NoteController
{

	@Autowired
	private NoteService noteService;

	@RequestMapping(value = "/notes")
	public String listNotes(Map<String, Object> map)
	{
		map.put("note", new Note());
		map.put("notesList", noteService.listNotes());
		return "note";
	}

	@RequestMapping(value = "/addnote", method = RequestMethod.POST)
	public String addNote(Note note)
	{
		noteService.addNote(note);
		return "redirect:/notes";
	}

	@RequestMapping(value = "/deletenote/{noteId}")
	public String deleteNote(@PathVariable("noteId") Integer id)
	{
		noteService.deleteNote(id);
		return "redirect:/notes";
	}
}