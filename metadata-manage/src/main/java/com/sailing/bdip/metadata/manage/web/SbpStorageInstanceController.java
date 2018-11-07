package com.sailing.bdip.metadata.manage.web;

import com.alibaba.druid.sql.PagerUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sailing.bdip.metadata.manage.entity.SbpStorageInstance;
import com.sailing.bdip.metadata.manage.service.SbpStorageInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("sbpStorageInstance")
public class SbpStorageInstanceController {

    @Autowired
    private SbpStorageInstanceService sbpStorageInstanceService;

    /**
     * 分页查询数据源
     * @param sbpStorageInstance
     * @return
     */
    @PostMapping("findInstancePage")
    public PageInfo<SbpStorageInstance> findInstancePage(int pageNo,int pageSize,SbpStorageInstance sbpStorageInstance){
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<SbpStorageInstance> pageInfo = sbpStorageInstanceService.findInstancePage(sbpStorageInstance).toPageInfo();
        return pageInfo;
    }
}
