package com.jcble.parking.common.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcble.parking.common.CommonEnum;
import com.jcble.parking.common.dao.admin.AlarmMsgDao;
import com.jcble.parking.common.dto.AlarmMsgReqDto;
import com.jcble.parking.common.model.devices.AlarmMsgDto;
import com.jcble.parking.common.service.admin.AlarmMsgService;

import baseproj.common.util.DateUtil;

@Service
public class AlarmMsgServiceImpl implements AlarmMsgService {

	@Autowired
	private AlarmMsgDao alarmMsgDao;

	@Override
	public List<AlarmMsgDto> getAlarmMessages(AlarmMsgDto dto) {
		List<AlarmMsgDto> alarmMessages = alarmMsgDao.queryAlarmMessagesByPage(dto);
		return alarmMessages;

	}

	@Override
	public void handAlarmMessages(AlarmMsgReqDto dto) throws Exception {
		List<AlarmMsgDto> AlarmMessages = dto.getAlarmMessage();
		for (AlarmMsgDto alarmMsgDto : AlarmMessages) {
			AlarmMsgDto alarmMsg = alarmMsgDao.select(alarmMsgDto);
			if (alarmMsg != null) {
				alarmMsg.setModifier(dto.getOperatorId());
				alarmMsg.setModifyTime(DateUtil.getDateTime());
				alarmMsg.setHandler(dto.getOperatorId());
				alarmMsg.setStatus(CommonEnum.AlarmHandleStatus.Processed.getValue());
				alarmMsgDao.update(alarmMsg);
			}
		}
	}

}
