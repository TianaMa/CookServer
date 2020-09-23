package com.demo.cook.modules.collect.controller;


import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.collect.service.ICollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/collect")
public class CollectController {

    private ICollectService praiseService;

    @Autowired
    public void setPraiseService(ICollectService praiseService) {
        this.praiseService = praiseService;
    }

    @RequestMapping(value = "/addCollect",method = RequestMethod.POST)
    public RtnResult addCollect(HttpServletRequest request){
        try {
            return praiseService.addCollect(request.getParameter("username"),request.getParameter("targetId"));
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

    @RequestMapping(value = "/cancelCollect",method = RequestMethod.POST)
    public RtnResult cancelCollect(HttpServletRequest request){
        try {
            return praiseService.cancelCollect(request.getParameter("username"),request.getParameter("targetId"));
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

}
