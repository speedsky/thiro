package com.my.service.impl;


import org.springframework.stereotype.Service;

import com.my.model.UserInfo;
import com.my.repository.UserInfoDao;
import com.my.service.UserInfoService;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}