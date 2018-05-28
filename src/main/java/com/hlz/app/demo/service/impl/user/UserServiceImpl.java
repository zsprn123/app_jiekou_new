package com.hlz.app.demo.service.impl.user;

import com.hlz.app.demo.dao.user.UserDao;
import com.hlz.app.demo.model.user.UserInfo;
import com.hlz.app.demo.service.user.UserService;
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
