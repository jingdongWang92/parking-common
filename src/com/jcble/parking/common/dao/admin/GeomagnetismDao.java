package com.jcble.parking.common.dao.admin;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.devices.GeomagnetismDto;
import com.jcble.parking.common.model.devices.ParkingLockDto;

/**
 * 地磁dao层接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface GeomagnetismDao extends BaseSimpleDao {

	public ParkingLockDto getDeviceByParkingId(ParkingLockDto lockDto);

	public GeomagnetismDto getGeomagnetismBySerialNo(String serialNumber);

}
