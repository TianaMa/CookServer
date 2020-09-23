package com.demo.cook.modules.praise.service;

import com.demo.cook.common.response.RtnResult;

public interface IPraiseService {

    RtnResult addPraise(String username, String productId) throws Exception;


    RtnResult cancelPraise(String username, String productId) throws Exception;
}
