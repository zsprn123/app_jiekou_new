package com.hlz.app.details.dao;

import com.hlz.app.details.model.DetailsDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface DetailsDao {
    List<DetailsDto> selectDetailsDataList(Map<String ,Object> queryMap);
}
