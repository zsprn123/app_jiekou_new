package com.hlz.app.user.service.impl;

import com.hlz.app.user.dao.ResumeDao;
import com.hlz.app.user.model.ResumeDto;
import com.hlz.app.user.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("ResumeService")
public  class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public void InsertResume(ResumeDto resumeDto) {

        resumeDao.insertresume(resumeDto);
    }

}
