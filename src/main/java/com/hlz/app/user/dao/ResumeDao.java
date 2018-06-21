package com.hlz.app.user.dao;

import com.hlz.app.user.model.ResumeDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ResumeDao {
   void insertresume(ResumeDto resumeDto);
}
