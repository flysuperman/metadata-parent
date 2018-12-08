package com.sailing.bdip.metadata.manage.web;

import com.sailing.bdip.metadata.manage.entity.SbpStorageObj;
import com.sailing.bdip.metadata.manage.service.SbpStorageObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbpStorageObjController {

    @Autowired
    private SbpStorageObjService sbpStorageObjService;

    @PostMapping("insertObj")
    public SbpStorageObj insertObj(SbpStorageObj sbpStorageObj){
        return sbpStorageObjService.insertObj(sbpStorageObj);
    }
}
