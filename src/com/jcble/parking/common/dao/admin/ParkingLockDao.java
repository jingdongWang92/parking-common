package com.jcble.parking.common.dao.admin;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.devices.ParkingLockDto;

/**
 * 车位锁dao层接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface ParkingLockDao extends BaseSimpleDao {

	public ParkingLockDto getDeviceByParkingId(ParkingLockDto lockDto);

	public ParkingLockDto getParkingLockBySerialNo(String serialNumber);

}
