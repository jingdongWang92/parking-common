package com.jcble.parking.common.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcble.parking.common.dao.admin.ParkingLotDao;
import com.jcble.parking.common.model.admin.ParkingLotDto;
import com.jcble.parking.common.service.admin.ParkingLotService;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

	@Autowired
	private ParkingLotDao dao;

	@Override
	public List<ParkingLotDto> queryParkingLots(ParkingLotDto dto) {
		List<ParkingLotDto> parkingLots = dao.queryParkingLotsByPage(dto);
		return parkingLots;
	}
}
