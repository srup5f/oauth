package com.general.dao;

import com.general.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao {

    /**
     * 登录验证
     */
    User findUser(@Param("username") String username,
                @Param("password") String password);

    List<User> findAllUser();
}
