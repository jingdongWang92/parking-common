package com.jcble.parking.common.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcble.parking.common.Exception.ParkingServiceException;
import com.jcble.parking.common.dao.admin.AdminDao;
import com.jcble.parking.common.dao.admin.PrivilegeDao;
import com.jcble.parking.common.dao.admin.RoleDao;
import com.jcble.parking.common.model.admin.AdminDto;
import com.jcble.parking.common.model.admin.PrivilegeDto;
import com.jcble.parking.common.model.admin.RoleDto;
import com.jcble.parking.common.service.AbstractBaseService;
import com.jcble.parking.common.service.admin.AdminService;

import baseproj.common.util.DateUtil;

@Service
public class AdminServiceImpl extends AbstractBaseService implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private PrivilegeDao privilegeDao;

	@Autowired
	private RoleDao roleDao;

	@Override
	public AdminDto login(AdminDto adminLoginDto) throws Exception {

		// String account = super.decryptAccount(adminLoginDto.getAccount());
		AdminDto admin = adminDao.findAdminByAccount(adminLoginDto.getAccount());
		if (admin == null) {
			throw new ParkingServiceException(ParkingServiceException.ERROR_10003);
		}
		String password = adminLoginDto.getPassword();
		if (!password.equalsIgnoreCase(admin.getPassword())) {
			throw new ParkingServiceException(ParkingServiceException.ERROR_10004);
		}

		// 获取管理员的角色权限信息
		RoleDto role = roleDao.getRoleByAdminId(admin.getId());
		if (role != null) {
			// 获取角色权限信息
			List<PrivilegeDto> privileges = privilegeDao.getPrivilegesByRoleId(role.getId());
			if (privileges == null || privileges.size() < 1) {
				throw new ParkingServiceException(ParkingServiceException.ERROR_10002);
			}
			StringBuffer url = new StringBuffer();
			for (PrivilegeDto privilegeDto : privileges) {
				url.append(privilegeDto.getPageUrl());
			}
			if (url.toString().contains("parking")) {
				admin.setType("0");
			}
			if (url.toString().contains("order")) {
				admin.setType("1");
			}
			if (url.toString().contains("order") && url.toString().contains("parking")) {
				admin.setType("2");
			}
		}
		// 记录最近登录时间
		admin.setRecentLoginTime(DateUtil.getDateTime());
		adminDao.update(admin);
		return admin;
	}

	@Override
	public void resetPassword(AdminDto adminDto) throws Exception {
		// String account = super.decryptAccount(adminDto.getAccount());
		AdminDto admin = adminDao.findAdminByAccount(adminDto.getAccount());
		if (admin == null) {
			throw new ParkingServiceException(ParkingServiceException.ERROR_10003);
		}
		admin.setModifyTime(DateUtil.getDateTime());
		admin.setPassword(adminDto.getPassword());
		adminDao.update(admin);
	}
}
