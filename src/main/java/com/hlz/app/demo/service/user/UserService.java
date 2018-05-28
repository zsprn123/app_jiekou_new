package com.hlz.app.demo.service.user;

import com.hlz.app.demo.model.user.UserInfo;

import java.util.List;

public interface UserService {
    int addUser(UserInfo user);
    List<UserInfo> findAllUser();
}
