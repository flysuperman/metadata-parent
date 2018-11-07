package com.sailing.bdip.metadata.confmanage.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_enum_dictionary")
public class SbpEnumDictionary implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 操作人
     */
    @Column(name = "OPERATE_PERSON")
    private String operatePerson;

    /**
     * 操作时间
     */
    @Column(name = "OPERATE_TIME")
    private Date operateTime;

    /**
     * 枚举id
     */
    @Column(name = "ENUM_ID")
    private String enumId;

    /**
     * 字典序号
     */
    @Column(name = "DICT_SEQ")
    private Long dictSeq;

    /**
     * 字典名称
     */
    @Column(name = "DICT_NAME")
    private String dictName;

    /**
     * 字典值
     */
    @Column(name = "DICT_VALUE")
    private String dictValue;

    /**
     * 字典描述
     */
    @Column(name = "DICT_DESC")
    private String dictDesc;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取枚举id
     *
     * @return ENUM_ID - 枚举id
     */
    public String getEnumId() {
        return enumId;
    }

    /**
     * 设置枚举id
     *
     * @param enumId 枚举id
     */
    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    /**
     * 获取字典序号
     *
     * @return DICT_SEQ - 字典序号
     */
    public Long getDictSeq() {
        return dictSeq;
    }

    /**
     * 设置字典序号
     *
     * @param dictSeq 字典序号
     */
    public void setDictSeq(Long dictSeq) {
        this.dictSeq = dictSeq;
    }

    /**
     * 获取字典名称
     *
     * @return DICT_NAME - 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置字典名称
     *
     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取字典值
     *
     * @return DICT_VALUE - 字典值
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 设置字典值
     *
     * @param dictValue 字典值
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * 获取字典描述
     *
     * @return DICT_DESC - 字典描述
     */
    public String getDictDesc() {
        return dictDesc;
    }

    /**
     * 设置字典描述
     *
     * @param dictDesc 字典描述
     */
    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operatePerson=").append(operatePerson);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", enumId=").append(enumId);
        sb.append(", dictSeq=").append(dictSeq);
        sb.append(", dictName=").append(dictName);
        sb.append(", dictValue=").append(dictValue);
        sb.append(", dictDesc=").append(dictDesc);
        sb.append("]");
        return sb.toString();
    }
}