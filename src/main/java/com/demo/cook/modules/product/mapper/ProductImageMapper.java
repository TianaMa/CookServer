package com.demo.cook.modules.product.mapper;

import com.demo.cook.modules.product.model.ProductImage;

public interface ProductImageMapper {

    int insert(ProductImage record);

    int insertSelective(ProductImage record);

}