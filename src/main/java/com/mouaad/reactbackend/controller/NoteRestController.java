package com.mouaad.reactbackend.controller;

import com.mouaad.reactbackend.entity.Note;
import com.mouaad.reactbackend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NoteRestController {
    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/allNotes")
    public ResponseEntity<List<Note>> readNote() {
        return new ResponseEntity<List<Note>>(noteRepository.findAll(), HttpStatus.OK);
    }
}
