package com.jcble.parking.common.service.admin.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcble.parking.common.dao.admin.ParkingDao;
import com.jcble.parking.common.dao.admin.ParkingLockDao;
import com.jcble.parking.common.model.admin.ParkingDto;
import com.jcble.parking.common.model.devices.ParkingLockDto;
import com.jcble.parking.common.service.admin.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	private ParkingDao dao;
	
	@Autowired
	private ParkingLockDao parkingLockDao;
	
	@Override
	public List<ParkingDto> queryParkings(ParkingDto dto) {
		List<ParkingDto> parkings = dao.queryParkingsByPage(dto);
//		for (ParkingDto parkingDto : parkings) {
//			ParkingLockDto lockDto = dto.getParkingLock();
//			lockDto.setParkingId(parkingDto.getId());
//			ParkingLockDto parkingLock = parkingLockDao.getDeviceByParkingId(lockDto);
//			parkingDto.setParkingLock(parkingLock);
//		}
		
//		if(StringUtils.isNotBlank(dto.getParkingLock().getStatus())) {
//			List<ParkingDto> list= new ArrayList<ParkingDto>();
//			for (int i = 0; i < parkings.size(); i++) {
//				ParkingDto parking = parkings.get(i);
//				if(parking.getParkingLock() != null && parking.getParkingLock().getStatus().equals(dto.getParkingLock().getStatus())) {
//					list.add(parking);
//				}
//			}
//			parkings = list;
//		}
		
		return parkings;
	}

	@Override
	public void creatParking() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
