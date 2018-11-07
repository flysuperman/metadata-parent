package com.sailing.bdip.metadata.confmanage.mapper;

import com.github.pagehelper.Page;
import com.sailing.bdip.metadata.common.mybatis.IBaseMapper;
import com.sailing.bdip.metadata.confmanage.entity.SbpEnumDictionary;

import java.util.List;

public interface SbpEnumDictionaryMapper extends IBaseMapper<SbpEnumDictionary> {

    public Page<SbpEnumDictionary> findDictPage(SbpEnumDictionary sbpEnumDictionary);
}