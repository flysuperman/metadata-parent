package com.sailing.bdip.metadata.confmanage.web;

import com.sailing.bdip.metadata.confmanage.entity.SbpEnum;
import com.sailing.bdip.metadata.confmanage.service.SbpEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 枚举controller
 */
@RestController("enum")
public class SbpEnumController {

    @Autowired
    private SbpEnumService sbpEnumService;

    /**
     * 增加枚举
     * @param sbpEnum
     * @return
     */
    @PostMapping("insertEnum")
    public int insertEnum(SbpEnum sbpEnum){
       return sbpEnumService.insertEnum(sbpEnum);
    }


    /**
     * 修改枚举
     * @param sbpEnum
     * @return
     */
    @PostMapping("updateEnum")
    public int updateEnum(SbpEnum sbpEnum){
        return sbpEnumService.updateEnum(sbpEnum);
    }

    /**
     *通过主键删除枚举
     * @param id 主键
     * @return
     */
    @PostMapping("deleteEnumByPk")
    public int deleteEnumByPk(String id){
        return sbpEnumService.deleteEnumByPk(id);
    }

    /**
     * 查询枚举
     * @param sbpEnum
     * @return
     */
    @PostMapping("findAllEnum")
    public List findAllEnum(SbpEnum sbpEnum){
        return sbpEnumService.findAllEnum(sbpEnum);
    }

    /**
     * 通过父id查询枚举
     * @param pid 父id
     * @return
     */
    @GetMapping("findAllEnumByPid")
    public List<Map> findAllEnumByPid(String pid){
        return sbpEnumService.findAllEnumByPid(pid);
    }
}
