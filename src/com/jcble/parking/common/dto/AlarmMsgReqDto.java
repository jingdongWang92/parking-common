package com.jcble.parking.common.dto;

import java.util.List;

import com.jcble.parking.common.model.devices.AlarmMsgDto;

public class AlarmMsgReqDto {

	private Integer operatorId;

	private List<AlarmMsgDto> alarmMessages;

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public List<AlarmMsgDto> getAlarmMessage() {
		return alarmMessages;
	}

	public void setAlarmMessages(List<AlarmMsgDto> alarmMessages) {
		this.alarmMessages = alarmMessages;
	}

}
