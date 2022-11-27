package com.maktab74.springbootnotephoneproject.maktab74.repository;

import com.maktab74.springbootnotephoneproject.maktab74.base.repository.BaseRepository;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {

}
