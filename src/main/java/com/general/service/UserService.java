package com.general.service;

import com.alibaba.fastjson.JSONObject;
import com.general.entity.User;


public interface UserService {

    User findUser(String username, String password);

    JSONObject findAllUser();
}
