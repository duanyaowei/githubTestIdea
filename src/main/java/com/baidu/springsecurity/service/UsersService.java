package com.baidu.springsecurity.service;

import com.baidu.springsecurity.bean.Users;
import org.apache.ibatis.annotations.Select;

public interface UsersService {
    public Users findUser();
}
