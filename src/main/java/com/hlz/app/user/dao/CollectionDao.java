package com.hlz.app.user.dao;

import com.hlz.app.user.model.CollectionDto;
import org.springframework.stereotype.Component;

@Component
public interface CollectionDao {
   void insertCollection(CollectionDto collectionDto);
}
