package com.demo.cook.modules.friends.mapper;

import com.demo.cook.modules.friends.model.Friend;
import com.demo.cook.modules.user.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FriendsMapper {


    List<Friend> getFriendList() throws Exception;





}