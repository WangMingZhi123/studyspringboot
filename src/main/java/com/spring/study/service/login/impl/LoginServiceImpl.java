package com.spring.study.service.login.impl;

import com.spring.study.dao.login.LoginDaoMapper;
import com.spring.study.entity.User;
import com.spring.study.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDaoMapper loginDaoMapper;

    @Override
    public Integer successLogin(User user) {
        return loginDaoMapper.loginCount(user);
    }
}
