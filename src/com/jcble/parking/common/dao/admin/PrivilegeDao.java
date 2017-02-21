package com.jcble.parking.common.dao.admin;

import java.util.List;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.PrivilegeDto;

public interface PrivilegeDao extends BaseSimpleDao {

	List<PrivilegeDto> getPrivilegesByRoleId(Integer roleId);

}
