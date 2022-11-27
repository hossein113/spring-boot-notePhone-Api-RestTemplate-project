package com.maktab74.springbootnotephoneproject.maktab74.service.impl;

import com.maktab74.springbootnotephoneproject.maktab74.base.dto.UsernameAndPasswprdDto;
import com.maktab74.springbootnotephoneproject.maktab74.base.service.impl.BaseServiceImpl;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import com.maktab74.springbootnotephoneproject.maktab74.repository.UserRepository;
import com.maktab74.springbootnotephoneproject.maktab74.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User,Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }


}
