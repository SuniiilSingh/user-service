package com.sun.user.service;

import com.sun.user.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String registerUser(UserDTO userDTO);
}
