package com.hlz.app.homePageData.dao;

import com.hlz.app.homePageData.model.DetailsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface DetailsDao {
    List<DetailsDto> selectDetailsDataList(Map<String ,Object> queryMap);
}
