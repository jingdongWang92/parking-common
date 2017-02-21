package com.jcble.parking.common.service.admin;

import java.util.List;

import com.jcble.parking.common.model.admin.ParkingDto;

public interface ParkingService {
	
	public List<ParkingDto> queryParkings(ParkingDto dto);

	public void creatParking() throws Exception;
	
}
