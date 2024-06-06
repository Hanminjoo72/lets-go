package com.example.letsGo.service;

import com.example.letsGo.dao.UserDao;
import com.example.letsGo.domain.member.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(String id) {
        return userDao.findById(id);
    }
}