package com.sailing.bdip.metadata.manage.service;

import com.alibaba.fastjson.JSON;
import com.sailing.bdip.metadata.common.tool.LoggerUtil;
import com.sailing.bdip.metadata.manage.entity.SbpStorageObj;
import com.sailing.bdip.metadata.manage.mapper.SbpStorageObjMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SbpStorageObjService {

    @Resource
    private SbpStorageObjMapper sbpStorageObjMapper;

    public SbpStorageObj insertObj(SbpStorageObj sbpStorageObj){
        sbpStorageObjMapper.insert(sbpStorageObj);
        return sbpStorageObj;
    }
}
