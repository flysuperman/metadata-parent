package com.sailing.bdip.metadata.metainterface.mapper;
import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.common.mybatis.IBaseMapper;
import com.sailing.bdip.metadata.metainterface.entity.SbpStorageInstance;

public interface SbpStorageInstanceMapper extends IBaseMapper<SbpStorageInstance> {

    /**
     *
     * @param dsCode
     * @return
     */
    public SbpStorageInstance findInstanceByDsCode(String dsCode);

}