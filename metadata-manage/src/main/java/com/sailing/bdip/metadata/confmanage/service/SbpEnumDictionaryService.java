package com.sailing.bdip.metadata.confmanage.service;

import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.common.tool.RandomUtils;
import com.sailing.bdip.metadata.confmanage.entity.SbpEnumDictionary;
import com.sailing.bdip.metadata.confmanage.mapper.SbpEnumDictionaryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 枚举字典service
 */
@Service
public class SbpEnumDictionaryService {

    @Resource
    private SbpEnumDictionaryMapper sbpEnumDictionaryMapper;

    /**
     * 增加枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    public int insertDict(SbpEnumDictionary sbpEnumDictionary){
        sbpEnumDictionary.setId(RandomUtils.get32UUIDRandom());
        sbpEnumDictionary.setOperateTime(new Date());
        sbpEnumDictionary.setOperatePerson("zs");
        return sbpEnumDictionaryMapper.insert(sbpEnumDictionary);
    }


    /**
     * 修改枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    public int updateDict(SbpEnumDictionary sbpEnumDictionary){
        sbpEnumDictionary.setOperateTime(new Date());
        sbpEnumDictionary.setOperatePerson("zs");
        return sbpEnumDictionaryMapper.updateByPrimaryKeySelective(sbpEnumDictionary);
    }

    /**
     *通过主键删除枚举字典
     * @param id 主键
     * @return
     */
    public int deleteDictByPk(String id){
        return sbpEnumDictionaryMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    public Page<SbpEnumDictionary> findDictPage(SbpEnumDictionary sbpEnumDictionary){
        return sbpEnumDictionaryMapper.findDictPage(sbpEnumDictionary);
    }
}
