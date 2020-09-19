package com.demo.cook.modules.user.controller;

import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.user.model.User;
import com.demo.cook.modules.user.service.IUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;



@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    IUserService userService;

    @Autowired
    public void setUserService(IUserService userService){
        this.userService=userService;
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public RtnResult<User> register(@RequestBody User user)  {
        try {
            System.out.println(new Gson().toJson(user));
            return userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST )
    public RtnResult<User> login(HttpServletRequest request ) {
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        try {
            return userService.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public RtnResult<User> updateUserInfo(@RequestBody User user) {
        try {
            return userService.updateUserInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

}
