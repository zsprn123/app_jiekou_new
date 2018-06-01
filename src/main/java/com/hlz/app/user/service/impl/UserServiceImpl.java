package com.hlz.app.user.service.impl;

import com.hlz.app.user.dao.UserDao;
import com.hlz.app.user.model.UserInfo;
import com.hlz.app.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(UserInfo user) {

        return userDao.insert(user);
    }

    @Override
    public List<UserInfo> findAllUser() {
        List<UserInfo> list = userDao.selectUsers();
        return list;
    }
}
