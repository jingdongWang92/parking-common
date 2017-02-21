package com.jcble.parking.common.dao.admin;

import java.util.List;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.ParkingLotDto;

/**
 * 停车场dao层接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface ParkingLotDao extends BaseSimpleDao {

   public List<ParkingLotDto> queryParkingLotsByPage(ParkingLotDto param);

}
