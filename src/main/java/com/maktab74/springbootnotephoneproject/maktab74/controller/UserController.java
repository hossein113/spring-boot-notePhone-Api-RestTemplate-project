package com.maktab74.springbootnotephoneproject.maktab74.controller;

import com.maktab74.springbootnotephoneproject.maktab74.base.domain.BaseEntity;
import com.maktab74.springbootnotephoneproject.maktab74.base.dto.UsernameAndPasswprdDto;
import com.maktab74.springbootnotephoneproject.maktab74.base.service.BaseService;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import com.maktab74.springbootnotephoneproject.maktab74.service.UserService;
import lombok.RequiredArgsConstructor;
import org.json.JSONException;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    protected final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> saveUser(@RequestBody User user) throws JSONException {
        User save = userService.save(user);

        return ResponseEntity.ok(user);

    }
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) throws JSONException {
        User save = userService.save(user);

        return ResponseEntity.ok(user);

    }
}
