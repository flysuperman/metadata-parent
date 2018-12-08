package com.sailing.bdip.metadata.metainterface.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sailing.bdip.metadata.metainterface.entity.SbpStorageInstance;
import com.sailing.bdip.metadata.metainterface.service.StorageInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageInstanceController {

    @Autowired
    private StorageInstanceService storageInstanceService;

    /**
     *
     * @param dsCode
     * @return
     */
    @GetMapping("si_info")
    public SbpStorageInstance  findInstanceInfo(String dsCode){
        return storageInstanceService.findInstanceInfo(dsCode);
    }
}
