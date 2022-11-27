package com.maktab74.springbootnotephoneproject.maktab74.domain;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long> {

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String username;
    private String password;


}
