package io.sachinsadasivan.examples.microservices.productcatalogservice.model;

import io.sachinsadasivan.examples.microservices.productinfoservice.model.ProductPaymentInfo;

public class ProductCatalog {

    private String productId;
    private ProductInfo productInfo;
    private ProductPaymentInfo productPaymentInfo;

    public ProductCatalog() {
    }

    public ProductCatalog(String productId, ProductInfo productInfo, ProductPaymentInfo productPaymentInfo) {
        this.productId = productId;
        this.productInfo = productInfo;
        this.productPaymentInfo = productPaymentInfo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public ProductPaymentInfo getProductPaymentInfo() {
        return productPaymentInfo;
    }

    public void setProductPaymentInfo(ProductPaymentInfo productPaymentInfo) {
        this.productPaymentInfo = productPaymentInfo;
    }
}
