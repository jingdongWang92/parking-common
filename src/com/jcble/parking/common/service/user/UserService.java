package com.jcble.parking.common.service.user;

import com.jcble.parking.common.model.user.UserDto;

/**
 * 用户业务接口
 * 
 * @author Jingdong Wang
 * 
 */
public interface UserService {
	/**
	 * 注册手机用户
	 * 
	 * @param userRegisterReq
	 * @throws Exception
	 */
	void register(UserDto user) throws Exception;

}
