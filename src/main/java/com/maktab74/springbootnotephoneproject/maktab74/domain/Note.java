package com.maktab74.springbootnotephoneproject.maktab74.domain;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "note")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Note extends BaseEntity<Long> {

    @ManyToOne
    private User user ;

    private String name;


}
