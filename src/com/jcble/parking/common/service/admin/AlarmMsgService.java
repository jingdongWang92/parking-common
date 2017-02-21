package com.jcble.parking.common.service.admin;

import java.util.List;

import com.jcble.parking.common.dto.AlarmMsgReqDto;
import com.jcble.parking.common.model.devices.AlarmMsgDto;

/**
 * 告警消息相关
 * @author Jingdong Wang
 *
 */
public interface AlarmMsgService {

	/**
	 * 获取告警消息
	 * @param dto
	 * @return
	 */
	public List<AlarmMsgDto> getAlarmMessages(AlarmMsgDto dto);

	/**
	 * 处理告警消息
	 * @param dto
	 * @throws Exception 
	 */
	public void handAlarmMessages(AlarmMsgReqDto dto) throws Exception;

	
	
}
