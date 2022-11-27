package com.maktab74.springbootnotephoneproject.maktab74.base.service;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntity<ID>,ID extends Serializable>{

  E save (E e) ;

  long count();

  List<E> findAll();

  void deletById(ID id);

}
