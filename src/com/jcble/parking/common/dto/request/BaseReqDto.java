package com.jcble.parking.common.dto.request;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseReqDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2049763411161148053L;

    /**
     * 版本号
     */
    private String v;
    /**
     * 时间戳
     */
    private String timestamp;
    /**
     * 客户端类型1:Android 2:IOS
     */
    private String apptype;
    /**
     * 签名信息
     */
    private String sign;
    /**
     * 用户账号
     */
    private String account;

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
