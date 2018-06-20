package com.hlz.app.homePageData.service;

import com.hlz.app.homePageData.model.UserInfoDto;

import java.util.List;

public interface UserInfoService {
    List<UserInfoDto> FindUserInfo(String user_uuid);
}
