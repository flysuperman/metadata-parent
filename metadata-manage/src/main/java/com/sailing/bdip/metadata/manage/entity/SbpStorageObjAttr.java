package com.sailing.bdip.metadata.manage.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_storage_obj_attr")
public class SbpStorageObjAttr implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "SOA_ID")
    private String soaId;

    /**
     * 存储库对象ID
     */
    @Column(name = "SO_ID")
    private String soId;

    /**
     * 字段类型
     */
    @Column(name = "ATTR_TYPE")
    private String attrType;

    /**
     * 字段名称
     */
    @Column(name = "ATTR_NAME")
    private String attrName;

    /**
     * 字段显示名称
     */
    @Column(name = "ATTR_DISPLAY_NAME")
    private String attrDisplayName;

    /**
     * 字段别名
     */
    @Column(name = "ATTR_ALIAS")
    private String attrAlias;

    /**
     * 字段长度
     */
    @Column(name = "ATTR_LENGTH")
    private Long attrLength;

    /**
     * 字段精度
     */
    @Column(name = "ATTR_PRECISION")
    private Long attrPrecision;

    /**
     * 是否为空
     */
    @Column(name = "CAN_NULL")
    private String canNull;

    /**
     * 默认值
     */
    @Column(name = "DDEFAULT")
    private String ddefault;

    /**
     * 是否主键
     */
    @Column(name = "IS_PK")
    private String isPk;

    /**
     * 是否外键
     */
    @Column(name = "IS_FK")
    private String isFk;

    /**
     * 是否索引，1是0非
     */
    @Column(name = "IS_INDEX")
    private String isIndex;

    /**
     * 是否必输1是0非
     */
    @Column(name = "IS_NEED")
    private String isNeed;

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
     * 字段状态1正常，0异常
     */
    @Column(name = "ATTR_STATUS")
    private String attrStatus;

    /**
     * 时间格式
     */
    @Column(name = "TIME_FORMAT")
    private String timeFormat;

    /**
     * 字段排序
     */
    @Column(name = "ATTR_SEQ")
    private Long attrSeq;

    /**
     * 创建方式 0自建，1目标源创建
     */
    @Column(name = "CREATE_TYPE")
    private String createType;

    /**
     * 父字段id
     */
    @Column(name = "PID")
    private String pid;

    /**
     * 列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键
     */
    @Column(name = "COl_TYPE")
    private String colType;

    /**
     * 字段的存储的长度单位,char或是byte
     */
    @Column(name = "COL_UNIT")
    private String colUnit;

    /**
     * 分布列 1：为分布列,用于gp或者libra分布列
     */
    @Column(name = "IS_DIS_COL")
    private String isDisCol;

    /**
     * 节点路径
     */
    @Column(name = "URN")
    private String urn;

    /**
     * 字段备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 异常原因
     */
    @Column(name = "REASON")
    private String reason;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return SOA_ID - 主键
     */
    public String getSoaId() {
        return soaId;
    }

    /**
     * 设置主键
     *
     * @param soaId 主键
     */
    public void setSoaId(String soaId) {
        this.soaId = soaId;
    }

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
     * 获取字段类型
     *
     * @return ATTR_TYPE - 字段类型
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * 设置字段类型
     *
     * @param attrType 字段类型
     */
    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    /**
     * 获取字段名称
     *
     * @return ATTR_NAME - 字段名称
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 设置字段名称
     *
     * @param attrName 字段名称
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取字段显示名称
     *
     * @return ATTR_DISPLAY_NAME - 字段显示名称
     */
    public String getAttrDisplayName() {
        return attrDisplayName;
    }

    /**
     * 设置字段显示名称
     *
     * @param attrDisplayName 字段显示名称
     */
    public void setAttrDisplayName(String attrDisplayName) {
        this.attrDisplayName = attrDisplayName;
    }

    /**
     * 获取字段别名
     *
     * @return ATTR_ALIAS - 字段别名
     */
    public String getAttrAlias() {
        return attrAlias;
    }

    /**
     * 设置字段别名
     *
     * @param attrAlias 字段别名
     */
    public void setAttrAlias(String attrAlias) {
        this.attrAlias = attrAlias;
    }

    /**
     * 获取字段长度
     *
     * @return ATTR_LENGTH - 字段长度
     */
    public Long getAttrLength() {
        return attrLength;
    }

    /**
     * 设置字段长度
     *
     * @param attrLength 字段长度
     */
    public void setAttrLength(Long attrLength) {
        this.attrLength = attrLength;
    }

    /**
     * 获取字段精度
     *
     * @return ATTR_PRECISION - 字段精度
     */
    public Long getAttrPrecision() {
        return attrPrecision;
    }

    /**
     * 设置字段精度
     *
     * @param attrPrecision 字段精度
     */
    public void setAttrPrecision(Long attrPrecision) {
        this.attrPrecision = attrPrecision;
    }

    /**
     * 获取是否为空
     *
     * @return CAN_NULL - 是否为空
     */
    public String getCanNull() {
        return canNull;
    }

    /**
     * 设置是否为空
     *
     * @param canNull 是否为空
     */
    public void setCanNull(String canNull) {
        this.canNull = canNull;
    }

    /**
     * 获取默认值
     *
     * @return DDEFAULT - 默认值
     */
    public String getDdefault() {
        return ddefault;
    }

    /**
     * 设置默认值
     *
     * @param ddefault 默认值
     */
    public void setDdefault(String ddefault) {
        this.ddefault = ddefault;
    }

    /**
     * 获取是否主键
     *
     * @return IS_PK - 是否主键
     */
    public String getIsPk() {
        return isPk;
    }

    /**
     * 设置是否主键
     *
     * @param isPk 是否主键
     */
    public void setIsPk(String isPk) {
        this.isPk = isPk;
    }

    /**
     * 获取是否外键
     *
     * @return IS_FK - 是否外键
     */
    public String getIsFk() {
        return isFk;
    }

    /**
     * 设置是否外键
     *
     * @param isFk 是否外键
     */
    public void setIsFk(String isFk) {
        this.isFk = isFk;
    }

    /**
     * 获取是否索引，1是0非
     *
     * @return IS_INDEX - 是否索引，1是0非
     */
    public String getIsIndex() {
        return isIndex;
    }

    /**
     * 设置是否索引，1是0非
     *
     * @param isIndex 是否索引，1是0非
     */
    public void setIsIndex(String isIndex) {
        this.isIndex = isIndex;
    }

    /**
     * 获取是否必输1是0非
     *
     * @return IS_NEED - 是否必输1是0非
     */
    public String getIsNeed() {
        return isNeed;
    }

    /**
     * 设置是否必输1是0非
     *
     * @param isNeed 是否必输1是0非
     */
    public void setIsNeed(String isNeed) {
        this.isNeed = isNeed;
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
     * 获取字段状态1正常，0异常
     *
     * @return ATTR_STATUS - 字段状态1正常，0异常
     */
    public String getAttrStatus() {
        return attrStatus;
    }

    /**
     * 设置字段状态1正常，0异常
     *
     * @param attrStatus 字段状态1正常，0异常
     */
    public void setAttrStatus(String attrStatus) {
        this.attrStatus = attrStatus;
    }

    /**
     * 获取时间格式
     *
     * @return TIME_FORMAT - 时间格式
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * 设置时间格式
     *
     * @param timeFormat 时间格式
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * 获取字段排序
     *
     * @return ATTR_SEQ - 字段排序
     */
    public Long getAttrSeq() {
        return attrSeq;
    }

    /**
     * 设置字段排序
     *
     * @param attrSeq 字段排序
     */
    public void setAttrSeq(Long attrSeq) {
        this.attrSeq = attrSeq;
    }

    /**
     * 获取创建方式 0自建，1目标源创建
     *
     * @return CREATE_TYPE - 创建方式 0自建，1目标源创建
     */
    public String getCreateType() {
        return createType;
    }

    /**
     * 设置创建方式 0自建，1目标源创建
     *
     * @param createType 创建方式 0自建，1目标源创建
     */
    public void setCreateType(String createType) {
        this.createType = createType;
    }

    /**
     * 获取父字段id
     *
     * @return PID - 父字段id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置父字段id
     *
     * @param pid 父字段id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键
     *
     * @return COl_TYPE - 列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键
     */
    public String getColType() {
        return colType;
    }

    /**
     * 设置列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键
     *
     * @param colType 列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键
     */
    public void setColType(String colType) {
        this.colType = colType;
    }

    /**
     * 获取字段的存储的长度单位,char或是byte
     *
     * @return COL_UNIT - 字段的存储的长度单位,char或是byte
     */
    public String getColUnit() {
        return colUnit;
    }

    /**
     * 设置字段的存储的长度单位,char或是byte
     *
     * @param colUnit 字段的存储的长度单位,char或是byte
     */
    public void setColUnit(String colUnit) {
        this.colUnit = colUnit;
    }

    /**
     * 获取分布列 1：为分布列,用于gp或者libra分布列
     *
     * @return IS_DIS_COL - 分布列 1：为分布列,用于gp或者libra分布列
     */
    public String getIsDisCol() {
        return isDisCol;
    }

    /**
     * 设置分布列 1：为分布列,用于gp或者libra分布列
     *
     * @param isDisCol 分布列 1：为分布列,用于gp或者libra分布列
     */
    public void setIsDisCol(String isDisCol) {
        this.isDisCol = isDisCol;
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

    /**
     * 获取字段备注
     *
     * @return REMARK - 字段备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段备注
     *
     * @param remark 字段备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取异常原因
     *
     * @return REASON - 异常原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置异常原因
     *
     * @param reason 异常原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", soaId=").append(soaId);
        sb.append(", soId=").append(soId);
        sb.append(", attrType=").append(attrType);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrDisplayName=").append(attrDisplayName);
        sb.append(", attrAlias=").append(attrAlias);
        sb.append(", attrLength=").append(attrLength);
        sb.append(", attrPrecision=").append(attrPrecision);
        sb.append(", canNull=").append(canNull);
        sb.append(", ddefault=").append(ddefault);
        sb.append(", isPk=").append(isPk);
        sb.append(", isFk=").append(isFk);
        sb.append(", isIndex=").append(isIndex);
        sb.append(", isNeed=").append(isNeed);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modPerson=").append(modPerson);
        sb.append(", modTime=").append(modTime);
        sb.append(", attrStatus=").append(attrStatus);
        sb.append(", timeFormat=").append(timeFormat);
        sb.append(", attrSeq=").append(attrSeq);
        sb.append(", createType=").append(createType);
        sb.append(", pid=").append(pid);
        sb.append(", colType=").append(colType);
        sb.append(", colUnit=").append(colUnit);
        sb.append(", isDisCol=").append(isDisCol);
        sb.append(", urn=").append(urn);
        sb.append(", remark=").append(remark);
        sb.append(", reason=").append(reason);
        sb.append("]");
        return sb.toString();
    }
}