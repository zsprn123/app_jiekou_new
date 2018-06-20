package com.hlz.app.homePageData.service.impl;

import com.hlz.app.homePageData.dao.UserInfoDao;
import com.hlz.app.homePageData.model.UserInfoDto;
import com.hlz.app.homePageData.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("UserInfoService")
public  class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfoDto> FindUserInfo(String user_uuid) {
        Map<String,Object> queryMap = new HashMap<String,Object>();
        queryMap.put("id",user_uuid);
        List<UserInfoDto> list = userInfoDao.selectUserInfoList(queryMap);
        return list;
    }

}
