package com.jcble.parking.common.dao.admin;

import com.jcble.parking.common.dao.BaseSimpleDao;
import com.jcble.parking.common.model.admin.AdminDto;

public interface AdminDao extends BaseSimpleDao {

	AdminDto findAdminByAccount(String account);

}
