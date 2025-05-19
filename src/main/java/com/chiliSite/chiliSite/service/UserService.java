package com.chiliSite.chiliSite.service;

import com.chiliSite.chiliSite.mapper.UserMapper;
import com.chiliSite.chiliSite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.findAllUsers();
    }
}
