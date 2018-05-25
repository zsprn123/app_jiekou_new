package com.hlz.app.demo.service;

import com.hlz.app.demo.model.UserInfo;

import java.util.List;

public interface UserService {
    int addUser(UserInfo user);
    List<UserInfo> findAllUser();
}
