package com.hlz.app.user.dao;

import com.hlz.app.user.model.CollectionDto;
import com.hlz.app.user.model.ResumeDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface ResumeDao {
   void insertResume(ResumeDto resumeDto);
   List<ResumeDto> selectResume(Map<String ,Object> queryMap);
}
