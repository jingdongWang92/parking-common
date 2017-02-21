package com.jcble.parking.common.service.admin;

import java.util.List;

import com.jcble.parking.common.model.admin.ParkingAreaDto;

public interface ParkingAreaService {
	
	public List<ParkingAreaDto> queryParkingAreas(ParkingAreaDto dto);

}
