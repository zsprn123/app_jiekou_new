package com.hlz.app.user.dao;

import com.hlz.app.user.model.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {
    int insert(UserInfo record);//方法名

    List<UserInfo> selectUsers();
}
