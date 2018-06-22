package com.hlz.app.user.service;


import com.hlz.app.user.model.ResumeDto;

import java.util.List;


public interface ResumeService {
     List<ResumeDto> FindResume(String user_uuid);
     void InsertResume(ResumeDto resumeDto);
}
