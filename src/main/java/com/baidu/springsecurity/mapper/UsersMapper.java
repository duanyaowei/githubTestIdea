package com.baidu.springsecurity.mapper;

import com.baidu.springsecurity.bean.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper{

    @Select("select * from users")
    public Users findUser();
}
