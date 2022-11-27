package com.maktab74.springbootnotephoneproject.maktab74.controller;


import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import com.maktab74.springbootnotephoneproject.maktab74.service.NoteService;
import com.maktab74.springbootnotephoneproject.maktab74.service.UserService;
import lombok.RequiredArgsConstructor;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {

    protected final NoteService noteService ;

    @PostMapping("/create")
    public ResponseEntity<Note> saveNote (@RequestBody Note note){

        noteService.save(note);

        return ResponseEntity.ok(note);

    }
    @PutMapping("/update")
    public ResponseEntity<Note> updateNote (@RequestBody Note note) throws JSONException {

        noteService.save(note);

        return ResponseEntity.ok(note);

    }
}
