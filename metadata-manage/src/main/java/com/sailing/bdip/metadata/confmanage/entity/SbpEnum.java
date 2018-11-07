package com.sailing.bdip.metadata.confmanage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_enum")
public class SbpEnum implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENUM_ID")
    private String enumId;

    /**
     * 操作人
     */
    @Column(name = "OPERATE_PERSON")
    private String operatePerson;

    /**
     * 操作时间
     */
    @Column(name = "OPERATE_TIME")
    @JsonFormat(pattern="yyyy-MM-dd mm:HH:ss")
    private Date operateTime;

    /**
     * 是否叶子节点
     */
    @Column(name = "LEAF")
    private String leaf;

    /**
     * 父id
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 1:系统自带,0:自定义
     */
    @Column(name = "IS_SYSTEM")
    private String isSystem;

    /**
     * 字典序号
     */
    @Column(name = "ENUM_SEQ")
    private Integer enumSeq;

    /**
     * 枚举名称
     */
    @Column(name = "ENUM_NAME")
    private String enumName;

    /**
     * 枚举值
     */
    @Column(name = "ENUM_VALUE")
    private String enumValue;

    /**
     * 枚举描述
     */
    @Column(name = "ENUM_DESC")
    private String enumDesc;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENUM_ID - 主键
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * 设置主键
     *
     * @param enumId 主键
     */
    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    /**
     * 获取操作人
     *
     * @return OPERATE_PERSON - 操作人
     */
    public String getOperatePerson() {
        return operatePerson;
    }

    /**
     * 设置操作人
     *
     * @param operatePerson 操作人
     */
    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    /**
     * 获取操作时间
     *
     * @return OPERATE_TIME - 操作时间
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置操作时间
     *
     * @param operateTime 操作时间
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 获取是否叶子节点
     *
     * @return LEAF - 是否叶子节点
     */
    public String getLeaf() {
        return leaf;
    }

    /**
     * 设置是否叶子节点
     *
     * @param leaf 是否叶子节点
     */
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    /**
     * 获取父id
     *
     * @return PARENT_ID - 父id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父id
     *
     * @param parentId 父id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取1:系统自带,0:自定义
     *
     * @return IS_SYSTEM - 1:系统自带,0:自定义
     */
    public String getIsSystem() {
        return isSystem;
    }

    /**
     * 设置1:系统自带,0:自定义
     *
     * @param isSystem 1:系统自带,0:自定义
     */
    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * 获取字典序号
     *
     * @return ENUM_SEQ - 字典序号
     */
    public Integer getEnumSeq() {
        return enumSeq;
    }

    /**
     * 设置字典序号
     *
     * @param enumSeq 字典序号
     */
    public void setEnumSeq(Integer enumSeq) {
        this.enumSeq = enumSeq;
    }

    /**
     * 获取枚举名称
     *
     * @return ENUM_NAME - 枚举名称
     */
    public String getEnumName() {
        return enumName;
    }

    /**
     * 设置枚举名称
     *
     * @param enumName 枚举名称
     */
    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    /**
     * 获取枚举值
     *
     * @return ENUM_VALUE - 枚举值
     */
    public String getEnumValue() {
        return enumValue;
    }

    /**
     * 设置枚举值
     *
     * @param enumValue 枚举值
     */
    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

    /**
     * 获取枚举描述
     *
     * @return ENUM_DESC - 枚举描述
     */
    public String getEnumDesc() {
        return enumDesc;
    }

    /**
     * 设置枚举描述
     *
     * @param enumDesc 枚举描述
     */
    public void setEnumDesc(String enumDesc) {
        this.enumDesc = enumDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enumId=").append(enumId);
        sb.append(", operatePerson=").append(operatePerson);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", leaf=").append(leaf);
        sb.append(", parentId=").append(parentId);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", enumSeq=").append(enumSeq);
        sb.append(", enumName=").append(enumName);
        sb.append(", enumValue=").append(enumValue);
        sb.append(", enumDesc=").append(enumDesc);
        sb.append("]");
        return sb.toString();
    }
}