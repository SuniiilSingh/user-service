package com.sun.user.controller;

import com.sun.user.dto.UserDTO;
import com.sun.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/registration")
    public String registerUser(@RequestBody @Valid UserDTO userDTO) {
        return userService.registerUser(userDTO);
    }

}
