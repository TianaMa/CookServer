package com.demo.cook.modules.product.service;

import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.product.model.Product;
import com.demo.cook.modules.product.model.ProductDetails;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface IProductService {

    RtnResult publish(Product product) throws Exception;


    RtnResult<PageInfo<ProductDetails>> queryMyPublishProduct(HttpServletRequest request) throws Exception;


    RtnResult updateMyProduct(Product product) throws Exception;


    RtnResult<PageInfo<Map<String,Object>>> queryProductList(HttpServletRequest request) throws Exception;

}
