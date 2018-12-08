package com.sailing.bdip.metadata.manage.web;

import com.alibaba.druid.sql.PagerUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sailing.bdip.metadata.common.core.Result;
import com.sailing.bdip.metadata.common.core.ResultCode;
import com.sailing.bdip.metadata.common.core.ResultGenerator;
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


    @PostMapping("insertInstance")
    public boolean insertInstance(SbpStorageInstance sbpStorageInstance) {
        return sbpStorageInstanceService.insertInstance(sbpStorageInstance);
    }


    @PostMapping("updateInstance")
    public int updateInstance(SbpStorageInstance sbpStorageInstance){
        return sbpStorageInstanceService.updateInstance(sbpStorageInstance);
    }

    /**
     * 分页查询数据源
     * @param sbpStorageInstance
     * @return
     */
    @PostMapping("findInstancePage")
    public Result findInstancePage(int pageNo, int pageSize, SbpStorageInstance sbpStorageInstance){
        PageHelper.startPage(pageNo,pageSize,true);
        PageInfo<SbpStorageInstance> pageInfo = sbpStorageInstanceService.findInstancePage(sbpStorageInstance).toPageInfo();
        return ResultGenerator.getSuccessResult(pageInfo,ResultCode.SUCCESS);
    }
}
