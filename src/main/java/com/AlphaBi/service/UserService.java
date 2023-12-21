package com.AlphaBi.service;

import com.AlphaBi.entity.User;
import com.AlphaBi.dto.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
