package com.demo.cook.modules.product.service;


import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.product.mapper.ProductMapper;
import com.demo.cook.modules.product.model.Product;
import com.demo.cook.modules.product.model.ProductDetails;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductServiceImpl implements IProductService {

    private ProductMapper productMapper;

    @Autowired
    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public RtnResult publish(Product product) throws Exception {

        String productId = UUID.randomUUID().toString();
        product.setProductId(productId);
        productMapper.insertProduct(product);
        return new RtnResult<>(Rtn.success);
    }

    @Override
    public RtnResult<PageInfo<Map<String,Object>>> queryMyPublishProduct(HttpServletRequest request) throws Exception {
        String username=request.getParameter("username");
        if (StringUtils.isNullOrEmpty(username)){
            return new RtnResult<>(Rtn.missingParameter);
        }
        int pageNum= ServletRequestUtils.getIntParameter(request,"pageNum",1);
        int pageSize= ServletRequestUtils.getIntParameter(request,"pageSize",20);
        PageHelper.startPage(pageNum, pageSize,true);
        List<ProductDetails> productDetails = productMapper.queryMyPublishProduct(username);

        PageInfo<Map<String,Object>> appsPageInfo = new PageInfo(productDetails);

        return new RtnResult<>(Rtn.success,appsPageInfo);
    }

    @Override
    public RtnResult updateMyProduct(Product product) throws Exception {
        return new RtnResult(Rtn.success,productMapper.updateByProductIdSelective(product));
    }

    @Override
    public RtnResult<PageInfo<Map<String,Object>>> queryProductList(HttpServletRequest request) throws Exception {

        String username=request.getParameter("username");
        String order=request.getParameter("order");

        int pageNum= ServletRequestUtils.getIntParameter(request,"pageNum",1);
        int pageSize= ServletRequestUtils.getIntParameter(request,"pageSize",20);
        PageHelper.startPage(pageNum, pageSize,true);
        List<ProductDetails> productDetails = productMapper.queryProductList(username, order);

        PageInfo<Map<String,Object>> appsPageInfo = new PageInfo(productDetails);

        return new RtnResult<>(Rtn.success,appsPageInfo);
    }


}
