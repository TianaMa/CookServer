package com.demo.cook.modules.product.mapper;

import com.demo.cook.modules.product.model.Product;

public interface ProductMapper {


    int insert(Product record);

    int deleteByPrimaryKey(String productId);

    Product selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Product record);

}