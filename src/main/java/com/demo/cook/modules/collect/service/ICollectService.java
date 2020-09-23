package com.demo.cook.modules.collect.service;

import com.demo.cook.common.response.RtnResult;

public interface ICollectService {

    RtnResult addCollect(String username, String productId) throws Exception;

    RtnResult cancelCollect(String username, String productId) throws Exception;
}
