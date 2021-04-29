package com.mouaad.reactbackend.controller;

import com.mouaad.reactbackend.entity.Note;
import com.mouaad.reactbackend.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

@CrossOrigin(origins = "https://reactnotesbackend.herokuapp.com/api/")
public class NoteRestController {
    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/allNotes")
    public ResponseEntity<List<Note>> readNote() {
        return new ResponseEntity<List<Note>>(noteRepository.findAll(), HttpStatus.OK);
    }



    @PostMapping("/addNote")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return new ResponseEntity<Note>(noteRepository.save(note), HttpStatus.CREATED);
    }
}
