package com.jcble.parking.common.service.admin;

import com.jcble.parking.common.model.admin.AdminDto;

public interface AdminService {

	/**
	 * 管理员登录
	 * @param adminLoginDto
	 * @return
	 * @throws Exception
	 */
	public AdminDto login(AdminDto adminLoginDto) throws Exception;

	/**
	 * 重置密码
	 * @param adminDto
	 * @param request 
	 * @throws Exception 
	 */
	public void resetPassword(AdminDto adminDto) throws Exception;

}
