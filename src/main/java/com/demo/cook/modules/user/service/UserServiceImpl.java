package com.demo.cook.modules.user.service;

import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.user.mapper.UserMapper;
import com.demo.cook.modules.user.model.User;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {


    UserMapper userMapper;

    @Autowired
    public void setUserDao (UserMapper userDao) {
        this.userMapper = userDao;
    }

    @Override
    public RtnResult<User> register(User user) throws Exception {
        int existUserCount = userMapper.getCountUserByUsername(user.getUsername());
        if(existUserCount>0){
            return new RtnResult(Rtn.userAlreadyExists);
        }
        int count=userMapper.insertSelective(user);
        if(count>0){
            User newUser = userMapper.selectUserByUsername(user.getUsername());
            return new RtnResult(Rtn.success,newUser);
        }else {
            return new RtnResult(Rtn.registerFail);
        }
    }

    @Override
    public RtnResult<User> login(String username, String password) throws Exception {
        if(StringUtils.isNullOrEmpty(username) || StringUtils.isNullOrEmpty(password)){
            return new RtnResult<>(Rtn.missingParameter);
        }

        User user = userMapper.selectUserByLogin(username,password);
        if(user==null){
            return new RtnResult<>(Rtn.userOrPasswordError);
        }else {
            return new RtnResult<>(Rtn.success,user);
        }
    }

    @Override
    public RtnResult<User> updateUserInfo(User user) throws Exception {
        int updateCount=userMapper.updateUserInfoSelective(user);
        if(updateCount>0){
            User newUser = userMapper.selectUserByUsername(user.getUsername());
            return new RtnResult(Rtn.success,newUser);
        }else {
            return new RtnResult(Rtn.editUserInfoError);
        }
    }


}
