package com.maktab74.springbootnotephoneproject.maktab74.base.service.impl;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import com.maktab74.springbootnotephoneproject.maktab74.base.repository.BaseRepository;
import com.maktab74.springbootnotephoneproject.maktab74.base.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(readOnly = true)
public class BaseServiceImpl<E extends BaseEntity<ID>, ID extends Serializable, R extends BaseRepository<E, ID>> implements BaseService<E, ID> {

    protected R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public E save(E e)  {
        return repository.save(e);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deletById(ID id) {
        repository.deleteById(id);
    }
}
