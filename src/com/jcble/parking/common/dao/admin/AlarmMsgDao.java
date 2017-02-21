package com.jcble.parking.common.dao.admin;

import java.util.List;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.devices.AlarmMsgDto;

public interface AlarmMsgDao extends BaseSimpleDao {

	public List<AlarmMsgDto> queryAlarmMessagesByPage(AlarmMsgDto dto);


}
