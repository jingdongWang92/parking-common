package com.jcble.parking.common.service.admin.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcble.parking.common.CommonEnum;
import com.jcble.parking.common.Exception.ParkingServiceException;
import com.jcble.parking.common.dao.admin.GeomagnetismDao;
import com.jcble.parking.common.dao.admin.ParkingDao;
import com.jcble.parking.common.dao.admin.ParkingLockDao;
import com.jcble.parking.common.dto.BindDevicesDto;
import com.jcble.parking.common.dto.DeviceDto;
import com.jcble.parking.common.model.admin.ParkingDto;
import com.jcble.parking.common.model.devices.GeomagnetismDto;
import com.jcble.parking.common.model.devices.ParkingLockDto;
import com.jcble.parking.common.service.admin.DevicesService;

import baseproj.common.util.DateUtil;

@Service
@Transactional(rollbackFor = { Exception.class })
public class DevicesServiceImpl implements DevicesService {

	@Autowired
	private ParkingLockDao lockDao;

	@Autowired
	private GeomagnetismDao geoDao;

	@Autowired
	private ParkingDao parkingDao;

	@Override
	public void bindDeviceToParking(BindDevicesDto devicesDto) throws Exception {
		List<DeviceDto> devices = devicesDto.getDevices();

		for (DeviceDto deviceDto : devices) {
			// 获取车位信息
			ParkingDto dto = new ParkingDto();
			dto.setId(deviceDto.getParkingId());
			ParkingDto parking = parkingDao.select(dto);
			if (parking == null) {
				throw new ParkingServiceException(ParkingServiceException.ERROR_00001);
			}
			if (CommonEnum.DeviceType.ParkingLock.getCode().equals(deviceDto.getDeviceType())) {
				// 检查设备是否已经被绑定
				ParkingLockDto device = lockDao.getParkingLockBySerialNo(deviceDto.getSerialNumber());
				if (device != null) {
					throw new ParkingServiceException(ParkingServiceException.ERROR_10007);
				}
				// 检查车位是否已绑定该种设备
				if (StringUtils.isNotBlank(parking.getLockSerialNumber())) {
					// 删除原有的设备
					ParkingLockDto bindDevice = lockDao.getParkingLockBySerialNo(parking.getLockSerialNumber());
					lockDao.delete(bindDevice);
				}
				ParkingLockDto parkingLock = new ParkingLockDto();
				parkingLock.setCreator(devicesDto.getOperatorId());
				parkingLock.setCreateTime(DateUtil.getDateTime());
				parkingLock.setSerialNumber(deviceDto.getSerialNumber());
				parkingLock.setParkingId(deviceDto.getParkingId());
				lockDao.insert(parkingLock);
				parking.setLockSerialNumber(deviceDto.getSerialNumber());
				parkingDao.update(parking);
			} else if (CommonEnum.DeviceType.Geomagnetism.getCode().equals(deviceDto.getDeviceType())) {
				// 检查设备是否已经被绑定
				GeomagnetismDto device = geoDao.getGeomagnetismBySerialNo(deviceDto.getSerialNumber());
				if (device != null) {
					throw new ParkingServiceException(ParkingServiceException.ERROR_10007);
				}
				// 检查车位是否已绑定该种设备
				if (StringUtils.isNotBlank(parking.getGeoSerialNumber())) {
					// 删除原有的设备
					GeomagnetismDto bindDevice = geoDao.getGeomagnetismBySerialNo(parking.getGeoSerialNumber());
					geoDao.delete(bindDevice);
				}
				GeomagnetismDto geomagnetism = new GeomagnetismDto();
				geomagnetism.setCreator(devicesDto.getOperatorId());
				geomagnetism.setCreateTime(DateUtil.getDateTime());
				geomagnetism.setSerialNumber(deviceDto.getSerialNumber());
				geomagnetism.setParkingId(deviceDto.getParkingId());
				geoDao.insert(geomagnetism);
				parking.setGeoSerialNumber(deviceDto.getSerialNumber());
				parkingDao.update(parking);
			}
		}
	}

}
