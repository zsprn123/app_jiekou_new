package com.hlz.app.user.service;

import com.hlz.app.user.model.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> findAllUser();
    public int addUser(UserInfo user);
}
