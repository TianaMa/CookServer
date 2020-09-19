package com.demo.cook.modules.user.mapper;

import com.demo.cook.modules.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {


    int getCountUserByUsername(@Param("username") String username) throws Exception ;

    int insertSelective(User record) throws Exception ;

    User selectUserByLogin(@Param("username") String username,@Param("password") String password) throws Exception ;

    int updateUserInfoSelective(User record) throws Exception ;

    User selectUserByUsername(@Param("username") String username) throws Exception ;

}