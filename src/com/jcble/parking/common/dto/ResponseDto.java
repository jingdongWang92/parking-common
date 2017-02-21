package com.jcble.parking.common.dto;


/**
 * 公共响应实体
 * 
 * @author Jingdong Wang
 * 
 */
public class ResponseDto {
	
	private boolean error = false;
	
	private String message = "";
	
	private Object payload;
	
	private Object meta;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public Object getMeta() {
		return meta;
	}

	public void setMeta(Object meta) {
		this.meta = meta;
	}
	
	

}
