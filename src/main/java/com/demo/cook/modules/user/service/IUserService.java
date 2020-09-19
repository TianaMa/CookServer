package com.demo.cook.modules.user.service;

import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.user.model.User;

import java.util.Map;

public interface IUserService {


    RtnResult<User> register(User user) throws Exception;

    RtnResult<User> login(String username,String password) throws Exception;

    RtnResult<User> updateUserInfo(User user) throws Exception;


}
