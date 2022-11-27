package com.maktab74.springbootnotephoneproject.maktab74.service.impl;

import com.maktab74.springbootnotephoneproject.maktab74.base.service.impl.BaseServiceImpl;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.repository.NoteRepository;
import com.maktab74.springbootnotephoneproject.maktab74.service.NoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class NotePhoneServiceImpl extends BaseServiceImpl<Note,Long, NoteRepository> implements NoteService {
    public NotePhoneServiceImpl(NoteRepository repository) {
        super(repository);
    }
}
