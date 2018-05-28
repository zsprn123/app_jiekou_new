package com.hlz.app.demo.dao.user;

import com.hlz.app.demo.model.user.UserInfo;

import java.util.List;

public interface UserDao {
    int insert(UserInfo record);//方法名

    List<UserInfo> selectUsers();
}
