package com.sailing.bdip.metadata.confmanage.service;

import com.sailing.bdip.metadata.common.Constants;
import com.sailing.bdip.metadata.common.tool.RandomUtils;
import com.sailing.bdip.metadata.confmanage.entity.SbpEnum;
import com.sailing.bdip.metadata.confmanage.mapper.SbpEnumMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 枚举service
 */
@Service
public class SbpEnumService {

    @Resource
    private SbpEnumMapper sbpEnumMapper;

    /**
     * 增加枚举
     * @param sbpEnum
     * @return
     */
    public int insertEnum(SbpEnum sbpEnum){
        sbpEnum.setEnumId(RandomUtils.get32UUIDRandom());
        sbpEnum.setOperateTime(new Date());
        sbpEnum.setOperatePerson("zs");
        return sbpEnumMapper.insert(sbpEnum);
    }


    /**
     * 修改枚举
     * @param sbpEnum
     * @return
     */
    public int updateEnum(SbpEnum sbpEnum){
        sbpEnum.setOperateTime(new Date());
        sbpEnum.setOperatePerson("zs");
        return sbpEnumMapper.updateByPrimaryKeySelective(sbpEnum);
    }

    /**
     *通过主键删除枚举
     * @param id 主键
     * @return
     */
    public int deleteEnumByPk(String id){
        return sbpEnumMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询枚举
     * @param sbpEnum
     * @return
     */
    public List findAllEnum(SbpEnum sbpEnum){
        return sbpEnumMapper.findAllEnum(sbpEnum);
    }

    /**
     * 按父id查询,用于树显示
     * @param pid
     * @return
     */
    public List<Map> findAllEnumByPid(String pid){
        return sbpEnumMapper.findAllEnumByPid(pid);
    }
}
