package com.sun.user.service.impl;

import com.sun.user.dto.UserDTO;
import com.sun.user.entity.Users;
import com.sun.user.repository.UserRepository;
import com.sun.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public String registerUser(UserDTO userDTO) {
        log.info("[:::::UserServiceImpl  registerUser::::::::]");
        try {
            if (!userRepository.existsByEmailId(userDTO.getEmailId())){
                userRepository.save(getUserEntity(userDTO));
            }else {
                throw new RuntimeException("user EmailId already Exists !!");
            }
        } catch (Exception exception) {
            log.error("[:::::UserServiceImpl  registerUser::::::::]");
            throw new RuntimeException(exception.getMessage());
        }
        return "SUCCESS";
    }

    private Users getUserEntity(UserDTO userDTO) {

        return modelMapper.map(userDTO, Users.class);
    }
}
