package com.hlz.app.user.dao;

import com.hlz.app.user.model.CollectionDto;
import com.hlz.app.user.model.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface CollectionDao {
   void insertCollection(CollectionDto collectionDto);
   List<CollectionDto> selectCollection(Map<String ,Object> queryMap);
   void updateCollection(CollectionDto collectionDto);
}
