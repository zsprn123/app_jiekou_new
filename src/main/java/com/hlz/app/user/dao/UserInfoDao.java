package com.hlz.app.user.dao;


import com.hlz.app.user.model.UserInfoDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface UserInfoDao {
    void insertUserInfoList(UserInfoDto userInfoDto);
    List<UserInfoDto> selectUserInfoList(Map<String, Object> queryMap);
    void updateUserInfoList(UserInfoDto userInfoDto);
}
