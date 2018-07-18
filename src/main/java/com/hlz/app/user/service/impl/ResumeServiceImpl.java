package com.hlz.app.user.service.impl;

import com.hlz.app.user.dao.ResumeDao;
import com.hlz.app.user.model.ResumeDto;
import com.hlz.app.user.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("ResumeService")
public  class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public void InsertResume(ResumeDto resumeDto) {
        resumeDao.insertResume(resumeDto);
    }

    @Override
    public List<ResumeDto> FindResume(String user_uuid) {
        Map<String,Object> queryMap = new HashMap<String,Object>();
        queryMap.put("userUuid",user_uuid);
        List<ResumeDto> list = resumeDao.selectResume(queryMap);
        return list;
    }

    @Override
    public void UpdateResume(ResumeDto resumeDto) {
        resumeDao.updateResume(resumeDto);
    }
}
