package com.jcble.parking.common.service.admin;

import com.jcble.parking.common.dto.BindDevicesDto;

/**
 * 设备相关
 * @author Jingdong Wang
 *
 */
public interface DevicesService {

	public void bindDeviceToParking(BindDevicesDto devicesDto) throws Exception;
	
	
}
