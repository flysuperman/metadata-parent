/*
 Navicat Premium Data Transfer

 Source Server         : 172.20.46.127
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : 172.20.46.127:3306
 Source Schema         : wg_db

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 08/12/2018 11:38:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sbp_conf_seq
-- ----------------------------
DROP TABLE IF EXISTS `sbp_conf_seq`;
CREATE TABLE `sbp_conf_seq`  (
  `SEQ_TYPE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'sequece类型',
  `NUM` bigint(20) NULL DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`SEQ_TYPE`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'sequece表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sbp_ds_conn_log
-- ----------------------------
DROP TABLE IF EXISTS `sbp_ds_conn_log`;
CREATE TABLE `sbp_ds_conn_log`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '主键',
  `CONN_START_TIME` datetime NULL DEFAULT NULL COMMENT '连接开始时间',
  `CONN_END_TIME` datetime NULL DEFAULT NULL COMMENT '连接结束时间',
  `USED_TIME` bigint(20) NULL DEFAULT NULL COMMENT '用时',
  `SI_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源id',
  `DS_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源编号',
  `OPERATE_PERSON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `OPERATE_TIME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作时间',
  `STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '1:成功，0：失败',
  `FAIlED_RESON` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '失败原因',
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `I_CL_SI_ID`(`SI_ID`) USING BTREE,
  INDEX `I_CL_DS_CODE`(`DS_CODE`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '连接日志表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sbp_enum
-- ----------------------------
DROP TABLE IF EXISTS `sbp_enum`;
CREATE TABLE `sbp_enum`  (
  `ENUM_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `ENUM_NAME` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '枚举名称',
  `ENUM_VALUE` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '枚举值',
  `ENUM_DESC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '枚举描述',
  `OPERATE_PERSON` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `OPERATE_TIME` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `LEAF` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否叶子节点',
  `PARENT_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父id',
  `IS_SYSTEM` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1:系统自带,0:自定义',
  `ENUM_SEQ` int(10) NULL DEFAULT NULL COMMENT '字典序号',
  PRIMARY KEY (`ENUM_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '枚举表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sbp_enum
-- ----------------------------
INSERT INTO `sbp_enum` VALUES ('42ca6b7288ba42b59bc8ad534715b764', '中国', 'china', '1', 'zs', '2018-11-06 14:56:09', NULL, '1', '1', 1);

-- ----------------------------
-- Table structure for sbp_enum_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `sbp_enum_dictionary`;
CREATE TABLE `sbp_enum_dictionary`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `DICT_NAME` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '字典名称',
  `DICT_VALUE` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '字典值',
  `DICT_DESC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '字典描述',
  `OPERATE_PERSON` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `OPERATE_TIME` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `ENUM_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '枚举id',
  `DICT_SEQ` bigint(20) NULL DEFAULT NULL COMMENT '字典序号',
  PRIMARY KEY (`ID`) USING BTREE,
  INDEX `ENUM_TYPE_ID`(`ENUM_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '枚举字典表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sbp_enum_dictionary
-- ----------------------------
INSERT INTO `sbp_enum_dictionary` VALUES ('1aa358918fb94c90b620656a6ccdd1aa', 'oracle', 'oracle', 'oracle数据库', 'zs', '2018-11-06 17:08:03', '42ca6b7288ba42b59bc8ad534715b764', 1);
INSERT INTO `sbp_enum_dictionary` VALUES ('1df6166cf9a248f6bb026e7b35c14fde', 'mysql', 'mysql', 'mysql数据库', 'zs', '2018-11-06 17:08:21', '42ca6b7288ba42b59bc8ad534715b764', 2);

-- ----------------------------
-- Table structure for sbp_hw_auth
-- ----------------------------
DROP TABLE IF EXISTS `sbp_hw_auth`;
CREATE TABLE `sbp_hw_auth`  (
  `AUTH_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '认证ID',
  `AUTH_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '认证名称',
  `AUTH_CODE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '认证代码',
  `AUTH_USER` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '认证用户',
  `AUTH_DESC` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '描述',
  `OPERATE_PERSON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `OPERATE_TIME` datetime NULL DEFAULT NULL COMMENT '操作时间'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '华为认证表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sbp_op_log
-- ----------------------------
DROP TABLE IF EXISTS `sbp_op_log`;
CREATE TABLE `sbp_op_log`  (
  `OP_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `OP_USER_ID` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户标识',
  `OP_USER_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称汉字',
  `ORG_ORG_CODE` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织编码',
  `OP_ORG_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织名称',
  `OP_IP` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `OP_TIME` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'YYYYMMDDhhmmss，24小时制格式',
  `OP_TYPE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作类型 0：登录；1：查询；2：新增；3：修改；4：删除',
  `OP_RESULT` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1:成功；0：失败',
  `OP_ERROR_CODE` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作失败的原因代码',
  `OP_SYS_ID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用系统标识（应用系统对应固定标志）',
  `OP_MODULE_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '功能模块名称',
  `OP_CONDITION` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '操作条件',
  PRIMARY KEY (`OP_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '操作日志表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sbp_storage_instance
-- ----------------------------
DROP TABLE IF EXISTS `sbp_storage_instance`;
CREATE TABLE `sbp_storage_instance`  (
  `SI_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `DS_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源编号',
  `SI_ALIAS` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源别名',
  `DS_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源名称',
  `ST_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '库类型,oracle、sqlserver',
  `DRIVER_CLASS` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驱动类',
  `URL` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '存储库URL',
  `USER_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `PASS_WORD` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `CHAR_ENCODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字符编码',
  `AUTH_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '认证编码，用于华为平台',
  `CONN_STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '连接状态 0:失败，1：成功',
  `SOURCE_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0源数据源,1目标数据源',
  `MANAGER` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理人',
  `MANAGE_DEPT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理单位',
  `TELEPHONE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `CREATOR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `MOD_PERSON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `MOD_TIME` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `URN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '节点路径',
  `REMARK` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注',
  PRIMARY KEY (`SI_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据源表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sbp_storage_instance
-- ----------------------------
INSERT INTO `sbp_storage_instance` VALUES ('001', '19999', NULL, '1000', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_instance` VALUES ('05', '01', NULL, '01', '10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-01-01 00:00:00', NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_instance` VALUES ('06', '01', NULL, '01', '10', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-01-12 00:00:00', NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_instance` VALUES ('14', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-01-14 00:00:00', NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_instance` VALUES ('15', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-01-14 00:00:00', NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_instance` VALUES ('9', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2018-01-12 00:00:00', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sbp_storage_obj
-- ----------------------------
DROP TABLE IF EXISTS `sbp_storage_obj`;
CREATE TABLE `sbp_storage_obj`  (
  `SO_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '存储库对象ID',
  `SI_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存储实例id',
  `SOT_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象类型',
  `OBJ_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象名称',
  `OBJ_DISPLAY_NAME` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '对象显示名称',
  `OBJ_ALIAS` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象别名',
  `REMARK` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '表备注',
  `CREATOR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `MOD_PERSON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `MOD_TIME` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `URN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '节点路径',
  `SOURCE_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0源数据源,1目标数据源',
  `CREATE_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建方式  0自建，1目标源创建',
  `SOURCE_LOGO` int(11) UNSIGNED NULL DEFAULT NULL COMMENT 'kafka 来源标识',
  `REGION_NUM` int(11) NULL DEFAULT NULL COMMENT 'hbase region个数或Solr中的collect分片数',
  `COLLECT_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'solr collect类型 0:自建，1:已存在',
  `FIELD_FLAG` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段标识 1：表字段都小写，2：表字段都大写',
  `PID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主表id',
  PRIMARY KEY (`SO_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据对象表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sbp_storage_obj
-- ----------------------------
INSERT INTO `sbp_storage_obj` VALUES ('1', '001', '2131', '312312', NULL, '321321', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_obj` VALUES ('111', '001', '2131', '312312', NULL, '321321', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sbp_storage_obj` VALUES ('1111', '001', '2131', '312312', NULL, '321321', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sbp_storage_obj_attr
-- ----------------------------
DROP TABLE IF EXISTS `sbp_storage_obj_attr`;
CREATE TABLE `sbp_storage_obj_attr`  (
  `SOA_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `SO_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存储库对象ID',
  `ATTR_TYPE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段类型',
  `ATTR_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段名称',
  `ATTR_DISPLAY_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段显示名称',
  `ATTR_ALIAS` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段别名',
  `ATTR_LENGTH` bigint(20) NULL DEFAULT NULL COMMENT '字段长度',
  `ATTR_PRECISION` bigint(20) NULL DEFAULT NULL COMMENT '字段精度',
  `CAN_NULL` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否为空',
  `DDEFAULT` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '默认值',
  `IS_PK` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否主键',
  `IS_FK` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否外键',
  `IS_INDEX` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否索引，1是0非',
  `IS_NEED` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否必输1是0非',
  `CREATOR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `MOD_PERSON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `MOD_TIME` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `URN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '节点路径',
  `REMARK` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '字段备注',
  `ATTR_STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段状态1正常，0异常',
  `REASON` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '异常原因',
  `TIME_FORMAT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时间格式',
  `ATTR_SEQ` bigint(20) NULL DEFAULT NULL COMMENT '字段排序',
  `CREATE_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建方式 0自建，1目标源创建',
  `PID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父字段id',
  `COl_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '列类型：hbase 0:rowkey,1:列簇 2:列   solr 0:唯一键',
  `COL_UNIT` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字段的存储的长度单位,char或是byte',
  `IS_DIS_COL` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分布列 1：为分布列,用于gp或者libra分布列',
  PRIMARY KEY (`SOA_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字段表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (12, 'string', '$2a$10$XjqUWoXXdW/RLrrCC7Atr.vYhxc7yYGTWmeKAJdGRT5mVkY6hWNta');
INSERT INTO `tb_user` VALUES (13, '1', '$2a$10$zYy4jXszz3myaGXbhYfKF.2UkllwRArjio7pagP7kRUnvqM/7kMAu');
INSERT INTO `tb_user` VALUES (14, '2', '$2a$10$TI6V7Nho8eqMs1cn6FSdnOQyJukoAzI/.ecNsWh1doXPs6eED6TS2');

SET FOREIGN_KEY_CHECKS = 1;
