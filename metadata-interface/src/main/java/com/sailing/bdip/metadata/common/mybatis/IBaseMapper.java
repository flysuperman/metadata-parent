package com.sailing.bdip.metadata.common.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用的mapp 启动类一定不能扫描到该类
 * 当然这一部分接口不需要你自己实现,所以它不能和其它的mapper放在一起,
 * 以免被@MapperScan("com.*.Mapper")扫描到,Mybatis扫描后发现你实现了这么多接口但是在映射文件却一个也没有实现,这时候就会报错。
 * 但是这些业务接口一定要被通用Mapper的MapperScan扫描到,由它来根据你在实体类与表中配关系生成通用的增删改查方法。

 * @param <T>
 */
public interface IBaseMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
