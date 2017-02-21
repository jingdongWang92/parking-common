package com.jcble.parking.common.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcble.parking.common.dao.admin.ParkingAreaDao;
import com.jcble.parking.common.model.admin.ParkingAreaDto;
import com.jcble.parking.common.service.admin.ParkingAreaService;

@Service
public class ParkingAreaServiceImpl implements ParkingAreaService {

	@Autowired
	private ParkingAreaDao dao;

	@Override
	public List<ParkingAreaDto> queryParkingAreas(ParkingAreaDto dto) {
		List<ParkingAreaDto> parkingAreas = dao.queryParkingAreas(dto);
		return parkingAreas;
	}
}
