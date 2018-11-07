package com.sailing.bdip.metadata.sequence.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "sbp_conf_seq")
public class SbpConfSeq implements Serializable {
    /**
     * sequece类型
     */
    @Id
    @Column(name = "SEQ_TYPE")
    private String seqType;

    /**
     * 数量
     */
    @Column(name = "NUM")
    private Long num;

    private static final long serialVersionUID = 1L;

    /**
     * 获取sequece类型
     *
     * @return SEQ_TYPE - sequece类型
     */
    public String getSeqType() {
        return seqType;
    }

    /**
     * 设置sequece类型
     *
     * @param seqType sequece类型
     */
    public void setSeqType(String seqType) {
        this.seqType = seqType;
    }

    /**
     * 获取数量
     *
     * @return NUM - 数量
     */
    public Long getNum() {
        return num;
    }

    /**
     * 设置数量
     *
     * @param num 数量
     */
    public void setNum(Long num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqType=").append(seqType);
        sb.append(", num=").append(num);
        sb.append("]");
        return sb.toString();
    }
}