package com.maktab74.springbootnotephoneproject.maktab74.base.dto;


import com.maktab74.springbootnotephoneproject.maktab74.domain.Contact;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsernameAndPasswprdDto extends User {

    private String firstName;
    private String lastName;

}
