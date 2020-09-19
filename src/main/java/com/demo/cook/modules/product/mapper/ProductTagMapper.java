package com.demo.cook.modules.product.mapper;

import com.demo.cook.modules.product.model.ProductTag;

public interface ProductTagMapper {
    int insert(ProductTag record);

    int insertSelective(ProductTag record);
}