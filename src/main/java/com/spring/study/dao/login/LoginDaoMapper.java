package com.spring.study.dao.login;

import com.spring.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDaoMapper {

    Integer loginCount(User user);
}
