package com.hlz.app.user.service.impl;

import com.hlz.app.user.dao.CollectionDao;
import com.hlz.app.user.model.CollectionDto;
import com.hlz.app.user.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CollectionService")
public  class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionDao collectionDao;
    @Override
    public void InsertCollection(CollectionDto collectionDto) {

        collectionDao.insertCollection(collectionDto);
    }

}
