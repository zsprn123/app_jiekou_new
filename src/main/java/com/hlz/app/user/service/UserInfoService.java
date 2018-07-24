package com.hlz.app.user.service;

import com.hlz.app.user.model.UserInfoDto;

import java.util.List;

public interface UserInfoService {
    List<UserInfoDto> FindUserInfo(String user_uuid);
    void UpdateUserInfoList(UserInfoDto userInfoDto);
    void InsertUserInfoList(UserInfoDto userInfoDto);
}
