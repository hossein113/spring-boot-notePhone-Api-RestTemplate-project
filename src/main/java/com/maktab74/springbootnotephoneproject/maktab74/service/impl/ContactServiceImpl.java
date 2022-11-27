package com.maktab74.springbootnotephoneproject.maktab74.service.impl;

import com.maktab74.springbootnotephoneproject.maktab74.base.service.impl.BaseServiceImpl;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Contact;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import com.maktab74.springbootnotephoneproject.maktab74.repository.ContactRepository;
import com.maktab74.springbootnotephoneproject.maktab74.service.ContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ContactServiceImpl extends BaseServiceImpl<Contact, Long, ContactRepository> implements ContactService {


    public ContactServiceImpl(ContactRepository repository) {
        super(repository);
    }

    @Override
    public List<Contact> findContactsByNote(Note not) {
        return repository.findContactsByNote(not);
    }

    @Override
    public List<Contact> findContactsByName(String name) {
        return repository.findContactsByName(name);
    }


}
