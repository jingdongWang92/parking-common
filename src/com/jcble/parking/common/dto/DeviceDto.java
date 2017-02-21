package com.jcble.parking.common.dto;

public class DeviceDto {
	
	//车位id
	private Integer parkingId;
	
	//设备串号
	private String serialNumber;
	
	//设备类型
	private String deviceType;

	public Integer getParkingId() {
		return parkingId;
	}

	public void setParkingId(Integer parkingId) {
		this.parkingId = parkingId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	
}
