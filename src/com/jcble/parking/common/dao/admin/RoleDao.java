package com.jcble.parking.common.dao.admin;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.RoleDto;

public interface RoleDao extends BaseSimpleDao {

	public RoleDto getRoleByAdminId(Integer adminId);

}
