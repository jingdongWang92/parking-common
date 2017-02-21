package com.jcble.parking.common.dto;

import java.util.List;

public class BindDevicesDto {
	
	private Integer operatorId;
	
	private List<DeviceDto> devices;

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public List<DeviceDto> getDevices() {
		return devices;
	}

	public void setDevices(List<DeviceDto> devices) {
		this.devices = devices;
	}
	
	
}
