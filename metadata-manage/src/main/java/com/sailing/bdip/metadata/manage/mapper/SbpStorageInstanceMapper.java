package com.sailing.bdip.metadata.manage.mapper;

import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.common.mybatis.IBaseMapper;
import com.sailing.bdip.metadata.manage.entity.SbpStorageInstance;

public interface SbpStorageInstanceMapper extends IBaseMapper<SbpStorageInstance> {

    /**
     * 分页查询数据源
     * @param sbpStorageInstance
     * @return
     */
    public Page<SbpStorageInstance> findInstancePage(SbpStorageInstance sbpStorageInstance);
}