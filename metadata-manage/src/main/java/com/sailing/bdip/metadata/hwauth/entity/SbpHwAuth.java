package com.sailing.bdip.metadata.hwauth.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_hw_auth")
public class SbpHwAuth implements Serializable {
    /**
     * 认证ID
     */
    @Column(name = "AUTH_ID")
    private String authId;

    /**
     * 认证名称
     */
    @Column(name = "AUTH_NAME")
    private String authName;

    /**
     * 认证代码
     */
    @Column(name = "AUTH_CODE")
    private String authCode;

    /**
     * 认证用户
     */
    @Column(name = "AUTH_USER")
    private String authUser;

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
     * 描述
     */
    @Column(name = "AUTH_DESC")
    private String authDesc;

    private static final long serialVersionUID = 1L;

    /**
     * 获取认证ID
     *
     * @return AUTH_ID - 认证ID
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * 设置认证ID
     *
     * @param authId 认证ID
     */
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    /**
     * 获取认证名称
     *
     * @return AUTH_NAME - 认证名称
     */
    public String getAuthName() {
        return authName;
    }

    /**
     * 设置认证名称
     *
     * @param authName 认证名称
     */
    public void setAuthName(String authName) {
        this.authName = authName;
    }

    /**
     * 获取认证代码
     *
     * @return AUTH_CODE - 认证代码
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * 设置认证代码
     *
     * @param authCode 认证代码
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * 获取认证用户
     *
     * @return AUTH_USER - 认证用户
     */
    public String getAuthUser() {
        return authUser;
    }

    /**
     * 设置认证用户
     *
     * @param authUser 认证用户
     */
    public void setAuthUser(String authUser) {
        this.authUser = authUser;
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
     * 获取描述
     *
     * @return AUTH_DESC - 描述
     */
    public String getAuthDesc() {
        return authDesc;
    }

    /**
     * 设置描述
     *
     * @param authDesc 描述
     */
    public void setAuthDesc(String authDesc) {
        this.authDesc = authDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authId=").append(authId);
        sb.append(", authName=").append(authName);
        sb.append(", authCode=").append(authCode);
        sb.append(", authUser=").append(authUser);
        sb.append(", operatePerson=").append(operatePerson);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", authDesc=").append(authDesc);
        sb.append("]");
        return sb.toString();
    }
}