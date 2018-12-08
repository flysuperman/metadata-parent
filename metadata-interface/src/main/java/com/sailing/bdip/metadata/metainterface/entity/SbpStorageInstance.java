package com.sailing.bdip.metadata.metainterface.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sbp_storage_instance")
public class SbpStorageInstance implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "SI_ID")
    private String siId;

    /**
     * 数据源编号
     */
    @Column(name = "DS_CODE")
    private String dsCode;

    /**
     * 数据源别名
     */
    @Column(name = "SI_ALIAS")
    private String siAlias;

    /**
     * 数据源名称
     */
    @Column(name = "DS_NAME")
    private String dsName;

    /**
     * 库类型,oracle、sqlserver
     */
    @Column(name = "ST_CODE")
    private String stCode;

    /**
     * 驱动类
     */
    @Column(name = "DRIVER_CLASS")
    private String driverClass;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "PASS_WORD")
    private String passWord;

    /**
     * 字符编码
     */
    @Column(name = "CHAR_ENCODE")
    private String charEncode;

    /**
     * 认证编码，用于华为平台
     */
    @Column(name = "AUTH_CODE")
    private String authCode;

    /**
     * 连接状态 0:失败，1：成功
     */
    @Column(name = "CONN_STATUS")
    private String connStatus;

    /**
     * 0源数据源,1目标数据源
     */
    @Column(name = "SOURCE_TYPE")
    private String sourceType;

    /**
     * 管理人
     */
    @Column(name = "MANAGER")
    private String manager;

    /**
     * 管理单位
     */
    @Column(name = "MANAGE_DEPT")
    private String manageDept;

    /**
     * 联系电话
     */
    @Column(name = "TELEPHONE")
    private String telephone;

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
     * 存储库URL
     */
    @Column(name = "URL")
    private String url;

    /**
     * 节点路径
     */
    @Column(name = "URN")
    private String urn;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return SI_ID - 主键
     */
    public String getSiId() {
        return siId;
    }

    /**
     * 设置主键
     *
     * @param siId 主键
     */
    public void setSiId(String siId) {
        this.siId = siId;
    }

    /**
     * 获取数据源编号
     *
     * @return DS_CODE - 数据源编号
     */
    public String getDsCode() {
        return dsCode;
    }

    /**
     * 设置数据源编号
     *
     * @param dsCode 数据源编号
     */
    public void setDsCode(String dsCode) {
        this.dsCode = dsCode;
    }

    /**
     * 获取数据源别名
     *
     * @return SI_ALIAS - 数据源别名
     */
    public String getSiAlias() {
        return siAlias;
    }

    /**
     * 设置数据源别名
     *
     * @param siAlias 数据源别名
     */
    public void setSiAlias(String siAlias) {
        this.siAlias = siAlias;
    }

    /**
     * 获取数据源名称
     *
     * @return DS_NAME - 数据源名称
     */
    public String getDsName() {
        return dsName;
    }

    /**
     * 设置数据源名称
     *
     * @param dsName 数据源名称
     */
    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    /**
     * 获取库类型,oracle、sqlserver
     *
     * @return ST_CODE - 库类型,oracle、sqlserver
     */
    public String getStCode() {
        return stCode;
    }

    /**
     * 设置库类型,oracle、sqlserver
     *
     * @param stCode 库类型,oracle、sqlserver
     */
    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    /**
     * 获取驱动类
     *
     * @return DRIVER_CLASS - 驱动类
     */
    public String getDriverClass() {
        return driverClass;
    }

    /**
     * 设置驱动类
     *
     * @param driverClass 驱动类
     */
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return PASS_WORD - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取字符编码
     *
     * @return CHAR_ENCODE - 字符编码
     */
    public String getCharEncode() {
        return charEncode;
    }

    /**
     * 设置字符编码
     *
     * @param charEncode 字符编码
     */
    public void setCharEncode(String charEncode) {
        this.charEncode = charEncode;
    }

    /**
     * 获取认证编码，用于华为平台
     *
     * @return AUTH_CODE - 认证编码，用于华为平台
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * 设置认证编码，用于华为平台
     *
     * @param authCode 认证编码，用于华为平台
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * 获取连接状态 0:失败，1：成功
     *
     * @return CONN_STATUS - 连接状态 0:失败，1：成功
     */
    public String getConnStatus() {
        return connStatus;
    }

    /**
     * 设置连接状态 0:失败，1：成功
     *
     * @param connStatus 连接状态 0:失败，1：成功
     */
    public void setConnStatus(String connStatus) {
        this.connStatus = connStatus;
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
     * 获取管理人
     *
     * @return MANAGER - 管理人
     */
    public String getManager() {
        return manager;
    }

    /**
     * 设置管理人
     *
     * @param manager 管理人
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 获取管理单位
     *
     * @return MANAGE_DEPT - 管理单位
     */
    public String getManageDept() {
        return manageDept;
    }

    /**
     * 设置管理单位
     *
     * @param manageDept 管理单位
     */
    public void setManageDept(String manageDept) {
        this.manageDept = manageDept;
    }

    /**
     * 获取联系电话
     *
     * @return TELEPHONE - 联系电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话
     *
     * @param telephone 联系电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
     * 获取存储库URL
     *
     * @return URL - 存储库URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置存储库URL
     *
     * @param url 存储库URL
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siId=").append(siId);
        sb.append(", dsCode=").append(dsCode);
        sb.append(", siAlias=").append(siAlias);
        sb.append(", dsName=").append(dsName);
        sb.append(", stCode=").append(stCode);
        sb.append(", driverClass=").append(driverClass);
        sb.append(", userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", charEncode=").append(charEncode);
        sb.append(", authCode=").append(authCode);
        sb.append(", connStatus=").append(connStatus);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", manager=").append(manager);
        sb.append(", manageDept=").append(manageDept);
        sb.append(", telephone=").append(telephone);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modPerson=").append(modPerson);
        sb.append(", modTime=").append(modTime);
        sb.append(", url=").append(url);
        sb.append(", urn=").append(urn);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}