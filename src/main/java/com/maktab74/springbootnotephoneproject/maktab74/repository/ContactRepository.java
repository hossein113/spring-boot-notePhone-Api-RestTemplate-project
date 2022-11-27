package com.maktab74.springbootnotephoneproject.maktab74.repository;

import com.maktab74.springbootnotephoneproject.maktab74.base.repository.BaseRepository;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Contact;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends BaseRepository<Contact,Long> {


   List<Contact> findContactsByNote(Note not);
   List<Contact> findContactsByName(String name);



}
