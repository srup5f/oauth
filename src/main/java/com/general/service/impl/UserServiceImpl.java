package com.general.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.general.dao.UserDao;
import com.general.entity.User;
import com.general.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;



    @Override
    public User findUser(String username, String password) {
        User user = userDao.findUser(username,password);
        return user;
    }

    @Override
    public JSONObject findAllUser() {
        List<User> userList = userDao.findAllUser();
        JSONObject ret = new JSONObject();
        if(userList != null){
            ret.put("userList",userList);
            ret.put("message","查询成功");
        }else{
            ret.put("message","查询失败");
        }
        return ret;
    }
}
