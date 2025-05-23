package com.chiliSite.chiliSite.mapper;

import com.chiliSite.chiliSite.model.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAllUsers();

    User findByEmail(String username);

    void insertUser(User user);
}