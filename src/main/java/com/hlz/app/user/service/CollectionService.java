package com.hlz.app.user.service;


import com.hlz.app.user.model.CollectionDto;

import java.util.List;


public interface CollectionService {
     List<CollectionDto> FindCollection(String user_uuid);
     void InsertCollection(CollectionDto collectionDto);
     void UpdateCollection(CollectionDto collectionDto);
}
