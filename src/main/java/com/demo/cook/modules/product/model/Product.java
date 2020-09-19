package com.demo.cook.modules.product.model;

import java.util.Date;

public class Product {
    private String productId;

    private String title;

    private String content;

    private Date createTime;

    public Product(String productId, String title, String content, Date createTime) {
        this.productId = productId;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public Product() {
        super();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}