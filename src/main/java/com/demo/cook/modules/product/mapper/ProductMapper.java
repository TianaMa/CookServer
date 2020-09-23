package com.demo.cook.modules.product.mapper;

import com.demo.cook.modules.product.model.Product;
import com.demo.cook.modules.product.model.ProductDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ProductMapper {

    int insertProduct(Product product) throws Exception;

    List<ProductDetails> queryMyPublishProduct(String username) throws Exception;

    int deleteByPrimaryKey(String productId) throws Exception;

    int updateByProductIdSelective(Product record) throws Exception;




    List<ProductDetails> queryProductList(@Param("loginUserName") String loginUserName, @Param("order") String order) throws Exception;

}