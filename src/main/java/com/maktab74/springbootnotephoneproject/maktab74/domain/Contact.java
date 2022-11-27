package com.maktab74.springbootnotephoneproject.maktab74.domain;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Contact extends BaseEntity<Long> {

    private String name;

    private String usernameGithub;
    @ElementCollection
    private List<String> nameRepository;

    @ManyToOne
    private Note note;


    @ElementCollection
    private List<String> phoneNumber;
    @ElementCollection

    private Set<String> homeNumber;
    @ElementCollection

    private Set<String> workNumber;
    @ElementCollection

    private Set<String> faxNumber;


}
