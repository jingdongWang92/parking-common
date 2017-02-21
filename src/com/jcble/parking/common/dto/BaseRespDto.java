package com.jcble.parking.common.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 公共响应实体
 * 
 * @author Jingdong Wang
 * 
 */
public class BaseRespDto implements Serializable {
    private static final long serialVersionUID = -3341775518152256809L;

    /**
     * 响应状态编码
     */
    private Integer respCode = 0;
    /**
     * 结果描述
     */
    private String respMsg = "";

    public Integer getRespCode() {
        return respCode;
    }

    public void setRespCode(Integer respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
