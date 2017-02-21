package com.jcble.parking.common.service.common.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.jcble.parking.common.CommonEnum;
import com.jcble.parking.common.dto.VerifyCodeDto;
import com.jcble.parking.common.model.DropDownDto;
import com.jcble.parking.common.service.AbstractBaseService;
import com.jcble.parking.common.service.common.CommonService;
import com.jcble.parking.common.utils.SMSUtil;

@Service
public class CommonServiceImpl extends AbstractBaseService implements CommonService {

	@Override
	public VerifyCodeDto getVerifyCode(VerifyCodeDto verifyCodeDto) throws Exception {
		VerifyCodeDto code = new VerifyCodeDto();
		// 下发验证码
        String vcode = SMSUtil.sendVcodeSMSToMobile(verifyCodeDto.getMobile());
		code.setVerifyCode("1234");
		return code;
	}

	@Override
	public List<DropDownDto> getDropdownByName(String dropdownName) {
		List<DropDownDto> list = new ArrayList<DropDownDto>();
		Map<String,String> map = CommonEnum.GeonStatus.codeMap;
		switch (dropdownName) {
		case "GeonStatus":
			map = CommonEnum.GeonStatus.codeMap;
			break;
		case "LockAlarmType":
			map = CommonEnum.LockAlarmType.codeMap;
			break;	
		case "GeoAlarmType":
			map = CommonEnum.GeoAlarmType.codeMap;
			break;	
		default:
			map = null;
			break;
		}
		if(map != null) {
			for (Map.Entry<String, String> entry : map.entrySet()) {  
				DropDownDto dropdown = new DropDownDto();
			    dropdown.setCode(entry.getKey());
			    dropdown.setDesc(entry.getValue());
			    list.add(dropdown);
			}  
		}
		return list;
	}


}
