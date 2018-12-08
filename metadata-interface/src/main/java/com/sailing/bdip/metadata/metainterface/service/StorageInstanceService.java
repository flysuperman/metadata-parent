package com.sailing.bdip.metadata.metainterface.service;

import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.metainterface.entity.SbpStorageInstance;
import com.sailing.bdip.metadata.metainterface.mapper.SbpStorageInstanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Service
public class StorageInstanceService {


    @Resource
    private SbpStorageInstanceMapper sbpStorageInstanceMapper;
    /**
     *
     * @param dsCode
     * @return
     */
    public SbpStorageInstance  findInstanceInfo(String dsCode){
       return  sbpStorageInstanceMapper.findInstanceByDsCode(dsCode);
    }
}
