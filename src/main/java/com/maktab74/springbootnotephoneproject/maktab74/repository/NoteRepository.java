package com.maktab74.springbootnotephoneproject.maktab74.repository;

import com.maktab74.springbootnotephoneproject.maktab74.base.repository.BaseRepository;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends BaseRepository<Note,Long> {
}
