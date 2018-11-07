package com.sailing.bdip.metadata.confmanage.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sailing.bdip.metadata.confmanage.entity.SbpEnumDictionary;
import com.sailing.bdip.metadata.confmanage.service.SbpEnumDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("sbpEnumDictionary")
public class SbpEnumDictionaryController {

    @Autowired
    private SbpEnumDictionaryService sbpEnumDictionaryService;

    /**
     * 增加枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    @PostMapping("insertDict")
    public int insertDict(SbpEnumDictionary sbpEnumDictionary){
        return  sbpEnumDictionaryService.insertDict(sbpEnumDictionary);
    }

    /**
     * 更新枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    @PostMapping("updateDict")
    public int updateDict(SbpEnumDictionary sbpEnumDictionary){
        return  sbpEnumDictionaryService.updateDict(sbpEnumDictionary);
    }

    /**
     *通过主键删除枚举字典
     * @param id 主键
     * @return
     */
    @GetMapping("deleteDictByPk")
    public int deleteDictByPk(String id){
        return  sbpEnumDictionaryService.deleteDictByPk(id);
    }

    /**
     * 查询枚举字典
     * @param sbpEnumDictionary
     * @return
     */
    @PostMapping("findDictPage")
    public PageInfo<SbpEnumDictionary> findDictPage(int pageNo, int pageSize, SbpEnumDictionary sbpEnumDictionary){
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<SbpEnumDictionary> pageInfo= sbpEnumDictionaryService.findDictPage(sbpEnumDictionary).toPageInfo();
        return pageInfo;
    }

}
