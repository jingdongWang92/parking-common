package com.jcble.parking.common.service.admin;

import java.util.List;

import com.jcble.parking.common.model.admin.ParkingLotDto;

public interface ParkingLotService {
	
	public List<ParkingLotDto> queryParkingLots(ParkingLotDto dto);

}
