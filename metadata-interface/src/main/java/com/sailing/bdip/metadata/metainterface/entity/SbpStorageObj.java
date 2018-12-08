package com.sailing.bdip.metadata.metainterface.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_storage_obj")
public class SbpStorageObj implements Serializable {
    /**
     * 存储库对象ID
     */
    @Id
    @Column(name = "SO_ID")
    private String soId;

    /**
     * 存储实例id
     */
    @Column(name = "SI_ID")
    private String siId;

    /**
     * 对象类型
     */
    @Column(name = "SOT_ID")
    private String sotId;

    /**
     * 对象名称
     */
    @Column(name = "OBJ_NAME")
    private String objName;

    /**
     * 对象别名
     */
    @Column(name = "OBJ_ALIAS")
    private String objAlias;

    /**
     * 创建人
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改人
     */
    @Column(name = "MOD_PERSON")
    private String modPerson;

    /**
     * 修改时间
     */
    @Column(name = "MOD_TIME")
    private Date modTime;

    /**
     * 0源数据源,1目标数据源
     */
    @Column(name = "SOURCE_TYPE")
    private String sourceType;

    /**
     * 创建方式  0自建，1目标源创建
     */
    @Column(name = "CREATE_TYPE")
    private String createType;

    /**
     * kafka 来源标识
     */
    @Column(name = "SOURCE_LOGO")
    private Integer sourceLogo;

    /**
     * hbase region个数或Solr中的collect分片数
     */
    @Column(name = "REGION_NUM")
    private Integer regionNum;

    /**
     * solr collect类型 0:自建，1:已存在
     */
    @Column(name = "COLLECT_TYPE")
    private String collectType;

    /**
     * 字段标识 1：表字段都小写，2：表字段都大写
     */
    @Column(name = "FIELD_FLAG")
    private String fieldFlag;

    /**
     * 主表id
     */
    @Column(name = "PID")
    private String pid;

    /**
     * 对象显示名称
     */
    @Column(name = "OBJ_DISPLAY_NAME")
    private String objDisplayName;

    /**
     * 表备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 节点路径
     */
    @Column(name = "URN")
    private String urn;

    private static final long serialVersionUID = 1L;

    /**
     * 获取存储库对象ID
     *
     * @return SO_ID - 存储库对象ID
     */
    public String getSoId() {
        return soId;
    }

    /**
     * 设置存储库对象ID
     *
     * @param soId 存储库对象ID
     */
    public void setSoId(String soId) {
        this.soId = soId;
    }

    /**
     * 获取存储实例id
     *
     * @return SI_ID - 存储实例id
     */
    public String getSiId() {
        return siId;
    }

    /**
     * 设置存储实例id
     *
     * @param siId 存储实例id
     */
    public void setSiId(String siId) {
        this.siId = siId;
    }

    /**
     * 获取对象类型
     *
     * @return SOT_ID - 对象类型
     */
    public String getSotId() {
        return sotId;
    }

    /**
     * 设置对象类型
     *
     * @param sotId 对象类型
     */
    public void setSotId(String sotId) {
        this.sotId = sotId;
    }

    /**
     * 获取对象名称
     *
     * @return OBJ_NAME - 对象名称
     */
    public String getObjName() {
        return objName;
    }

    /**
     * 设置对象名称
     *
     * @param objName 对象名称
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }

    /**
     * 获取对象别名
     *
     * @return OBJ_ALIAS - 对象别名
     */
    public String getObjAlias() {
        return objAlias;
    }

    /**
     * 设置对象别名
     *
     * @param objAlias 对象别名
     */
    public void setObjAlias(String objAlias) {
        this.objAlias = objAlias;
    }

    /**
     * 获取创建人
     *
     * @return CREATOR - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人
     *
     * @return MOD_PERSON - 修改人
     */
    public String getModPerson() {
        return modPerson;
    }

    /**
     * 设置修改人
     *
     * @param modPerson 修改人
     */
    public void setModPerson(String modPerson) {
        this.modPerson = modPerson;
    }

    /**
     * 获取修改时间
     *
     * @return MOD_TIME - 修改时间
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * 设置修改时间
     *
     * @param modTime 修改时间
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * 获取0源数据源,1目标数据源
     *
     * @return SOURCE_TYPE - 0源数据源,1目标数据源
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 设置0源数据源,1目标数据源
     *
     * @param sourceType 0源数据源,1目标数据源
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取创建方式  0自建，1目标源创建
     *
     * @return CREATE_TYPE - 创建方式  0自建，1目标源创建
     */
    public String getCreateType() {
        return createType;
    }

    /**
     * 设置创建方式  0自建，1目标源创建
     *
     * @param createType 创建方式  0自建，1目标源创建
     */
    public void setCreateType(String createType) {
        this.createType = createType;
    }

    /**
     * 获取kafka 来源标识
     *
     * @return SOURCE_LOGO - kafka 来源标识
     */
    public Integer getSourceLogo() {
        return sourceLogo;
    }

    /**
     * 设置kafka 来源标识
     *
     * @param sourceLogo kafka 来源标识
     */
    public void setSourceLogo(Integer sourceLogo) {
        this.sourceLogo = sourceLogo;
    }

    /**
     * 获取hbase region个数或Solr中的collect分片数
     *
     * @return REGION_NUM - hbase region个数或Solr中的collect分片数
     */
    public Integer getRegionNum() {
        return regionNum;
    }

    /**
     * 设置hbase region个数或Solr中的collect分片数
     *
     * @param regionNum hbase region个数或Solr中的collect分片数
     */
    public void setRegionNum(Integer regionNum) {
        this.regionNum = regionNum;
    }

    /**
     * 获取solr collect类型 0:自建，1:已存在
     *
     * @return COLLECT_TYPE - solr collect类型 0:自建，1:已存在
     */
    public String getCollectType() {
        return collectType;
    }

    /**
     * 设置solr collect类型 0:自建，1:已存在
     *
     * @param collectType solr collect类型 0:自建，1:已存在
     */
    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }

    /**
     * 获取字段标识 1：表字段都小写，2：表字段都大写
     *
     * @return FIELD_FLAG - 字段标识 1：表字段都小写，2：表字段都大写
     */
    public String getFieldFlag() {
        return fieldFlag;
    }

    /**
     * 设置字段标识 1：表字段都小写，2：表字段都大写
     *
     * @param fieldFlag 字段标识 1：表字段都小写，2：表字段都大写
     */
    public void setFieldFlag(String fieldFlag) {
        this.fieldFlag = fieldFlag;
    }

    /**
     * 获取主表id
     *
     * @return PID - 主表id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置主表id
     *
     * @param pid 主表id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取对象显示名称
     *
     * @return OBJ_DISPLAY_NAME - 对象显示名称
     */
    public String getObjDisplayName() {
        return objDisplayName;
    }

    /**
     * 设置对象显示名称
     *
     * @param objDisplayName 对象显示名称
     */
    public void setObjDisplayName(String objDisplayName) {
        this.objDisplayName = objDisplayName;
    }

    /**
     * 获取表备注
     *
     * @return REMARK - 表备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置表备注
     *
     * @param remark 表备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取节点路径
     *
     * @return URN - 节点路径
     */
    public String getUrn() {
        return urn;
    }

    /**
     * 设置节点路径
     *
     * @param urn 节点路径
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", soId=").append(soId);
        sb.append(", siId=").append(siId);
        sb.append(", sotId=").append(sotId);
        sb.append(", objName=").append(objName);
        sb.append(", objAlias=").append(objAlias);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modPerson=").append(modPerson);
        sb.append(", modTime=").append(modTime);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", createType=").append(createType);
        sb.append(", sourceLogo=").append(sourceLogo);
        sb.append(", regionNum=").append(regionNum);
        sb.append(", collectType=").append(collectType);
        sb.append(", fieldFlag=").append(fieldFlag);
        sb.append(", pid=").append(pid);
        sb.append(", objDisplayName=").append(objDisplayName);
        sb.append(", remark=").append(remark);
        sb.append(", urn=").append(urn);
        sb.append("]");
        return sb.toString();
    }
}