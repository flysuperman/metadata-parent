package com.sailing.bdip.metadata.manage.service;

import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.common.tool.LoggerUtil;
import com.sailing.bdip.metadata.manage.entity.SbpStorageInstance;
import com.sailing.bdip.metadata.manage.mapper.SbpStorageInstanceMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SbpStorageInstanceService {



    @Autowired
    private SbpStorageInstanceMapper sbpStorageInstanceMapper;

    /**
     * 增加数据源
     * @param sbpStorageInstance
     * @return
     */
    public boolean insertInstance(SbpStorageInstance sbpStorageInstance) {
        return sbpStorageInstanceMapper.insert(sbpStorageInstance)>0;
    }

    /**
     * 修改数据源
     * @param sbpStorageInstance
     * @return
     */
    public int updateInstance(SbpStorageInstance sbpStorageInstance){
        return sbpStorageInstanceMapper.updateByPrimaryKey(sbpStorageInstance);
    }

    /**
     * 通过主键删除数据源
     * @param siId 主键
     * @return
     */
    public int deleteInstanceByPk(String siId){
        return sbpStorageInstanceMapper.deleteByPrimaryKey(siId);
    }

    /**
     * 分页查询数据源
     * @param sbpStorageInstance
     * @return
     */
    public Page<SbpStorageInstance> findInstancePage(SbpStorageInstance sbpStorageInstance){
        return sbpStorageInstanceMapper.findInstancePage(sbpStorageInstance);
    }
}
