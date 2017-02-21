package com.jcble.parking.common.dao.admin;

import java.util.List;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.ParkingDto;

/**
 * 车位dao层接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface ParkingDao extends BaseSimpleDao {

   public List<ParkingDto> queryParkingsByPage(ParkingDto param);

}
