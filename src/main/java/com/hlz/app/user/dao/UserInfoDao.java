package com.hlz.app.user.dao;


import com.hlz.app.user.model.UserInfoDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface UserInfoDao {
    List<UserInfoDto> selectUserInfoList(Map<String, Object> queryMap);

    int insert(UserInfoDto record);//方法名
}
