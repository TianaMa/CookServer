package com.demo.cook.modules.product.mapper;

import com.demo.cook.modules.product.model.ProductTagRelation;

public interface ProductTagRelationMapper {
    int insert(ProductTagRelation record);

    int insertSelective(ProductTagRelation record);
}