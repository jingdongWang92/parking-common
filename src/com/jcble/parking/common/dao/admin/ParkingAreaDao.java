package com.jcble.parking.common.dao.admin;

import java.util.List;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.ParkingAreaDto;

/**
 * 停车场区域dao层接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface ParkingAreaDao extends BaseSimpleDao {

   public List<ParkingAreaDto> queryParkingAreas(ParkingAreaDto param);

}
