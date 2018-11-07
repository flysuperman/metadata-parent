package com.sailing.bdip.metadata.confmanage.mapper;

import com.sailing.bdip.metadata.common.mybatis.IBaseMapper;
import com.sailing.bdip.metadata.confmanage.entity.SbpEnum;

import java.util.List;
import java.util.Map;

public interface SbpEnumMapper extends IBaseMapper<SbpEnum> {

    /**
     * 按条件查询枚举
     * @param sbpEnum
     * @return
     */
    public List<SbpEnum> findAllEnum(SbpEnum sbpEnum);

    /**
     * 按父id查询
     * @param pid
     * @return
     */
    public List<Map> findAllEnumByPid(String pid);
}