package com.hlz.app.homePageData.dao;


import com.hlz.app.homePageData.model.UserInfoDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface UserInfoDao {
    List<UserInfoDto> selectUserInfoList(Map<String, Object> queryMap);
}
