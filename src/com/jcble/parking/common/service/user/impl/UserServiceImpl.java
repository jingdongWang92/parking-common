package com.jcble.parking.common.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcble.parking.common.dao.user.UserDao;
import com.jcble.parking.common.model.user.UserDto;
import com.jcble.parking.common.service.user.UserService;

/**
 * 用户业务信息接口实现
 * 
 * @author Jingdong Wang
 * 
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 用户注册业务操作
     * 
     * @param userRegisterReq
     * @throws Exception
     */
    @Override
    public void register(UserDto user) throws Exception {
    	userDao.insert(user);
    }

   

    
}
