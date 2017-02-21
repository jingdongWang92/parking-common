package com.jcble.parking.common.Exception;

import baseproj.common.exception.BaseServiceException;

/**
 * 自定义异常类
 * 
 * @author Jingdong Wang
 * 
 */
public class ParkingServiceException extends BaseServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int ERROR_00001 = 00001; //
    public static final int ERROR_10000 = 10000; // 系统错误
    public static final int ERROR_10001 = 10001; // 请求参数错误
    public static final int ERROR_10002 = 10002; // 没有权限
    public static final int ERROR_10003 = 10003; // 账号信息不存在
    public static final int ERROR_10004 = 10004; // 密码错误
    public static final int ERROR_10005 = 10005; // 车位不存在
    public static final int ERROR_10006 = 10006; // 验证码错误
    public static final int ERROR_10007 = 10007; // 设备已经被绑定

	public ParkingServiceException(int erroCode) {
		super(erroCode);
		this.setExceptionDesc(erroCode);
	}

	public ParkingServiceException(int erroCode, Object... params) {
		super(erroCode);
		if (params == null) {
			throw new IllegalArgumentException("params can't be null");
		}
		this.setExceptionDesc(erroCode, params);
	}
	
	/**
     * 设置业务异常描述
     * 
     * @param erroCode
     */
    protected void setExceptionDesc(int erroCode, Object... params) {
        switch (erroCode) {
        case ERROR_00001:
            this.setErroDesc("%s", params);
            break;
        case ERROR_10000:
            this.setErroDesc("", params);
            break;
        case ERROR_10001:
            this.setErroDesc("请求参数错误", params);
            break;
        case ERROR_10002:
            this.setErroDesc("没有权限", params);
            break;
        case ERROR_10003:
            this.setErroDesc("账号信息不存在", params);
            break;
        case ERROR_10004:
            this.setErroDesc("密码错误", params);
            break;
        case ERROR_10005:
            this.setErroDesc("车位不存在", params);
            break;
        case ERROR_10006:
        	this.setErroDesc("验证码错误", params);
        	break;
        case ERROR_10007:
        	this.setErroDesc("设备已经被绑定", params);
        	break;
        }
    }

    public void setErroDesc(String erroDesc, Object... params) {
        super.setErroDesc(String.format(erroDesc, params));
    }
}
