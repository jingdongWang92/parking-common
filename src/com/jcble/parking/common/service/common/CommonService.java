package com.jcble.parking.common.service.common;

import java.util.List;

import com.jcble.parking.common.dto.VerifyCodeDto;
import com.jcble.parking.common.model.DropDownDto;

public interface CommonService {

	/**
	 * 获取验证码
	 * @param verifyCodeDto
	 * @return
	 * @throws Exception
	 */
	public VerifyCodeDto getVerifyCode(VerifyCodeDto verifyCodeDtozz) throws Exception;
	
	public List<DropDownDto> getDropdownByName(String dropdownName);

}
