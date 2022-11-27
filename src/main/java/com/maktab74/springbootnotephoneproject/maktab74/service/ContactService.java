package com.maktab74.springbootnotephoneproject.maktab74.service;

import com.maktab74.springbootnotephoneproject.maktab74.base.dto.UsernameAndPasswprdDto;
import com.maktab74.springbootnotephoneproject.maktab74.base.service.BaseService;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Contact;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;

import java.util.List;

public interface ContactService extends BaseService<Contact, Long> {

    List<Contact> findContactsByNote(Note not);
    List<Contact> findContactsByName(String name);

}
