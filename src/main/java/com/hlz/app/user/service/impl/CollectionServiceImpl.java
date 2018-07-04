package com.hlz.app.user.service.impl;

import com.hlz.app.user.dao.CollectionDao;
import com.hlz.app.user.model.CollectionDto;
import com.hlz.app.user.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CollectionService")
public  class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionDao collectionDao;
    @Override
    public void InsertCollection(CollectionDto collectionDto) {

        collectionDao.insertCollection(collectionDto);
    }
    @Override
    public List<CollectionDto> FindCollection(String user_uuid) {
        Map<String,Object> queryMap = new HashMap<String,Object>();
        queryMap.put("userUuid",user_uuid);
        List<CollectionDto> list = collectionDao.selectCollection(queryMap);
        return list;
    }

    @Override
    public void UpdateCollection(CollectionDto collectionDto) {
        collectionDao.updateCollection(collectionDto);
    }
}
