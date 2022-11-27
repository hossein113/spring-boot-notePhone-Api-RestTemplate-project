package com.maktab74.springbootnotephoneproject.maktab74.base.repository;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntity<ID>,ID extends Serializable> extends JpaRepository<E,ID>  {

}
