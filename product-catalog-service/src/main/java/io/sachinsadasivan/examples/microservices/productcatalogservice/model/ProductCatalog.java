package io.sachinsadasivan.examples.microservices.productcatalogservice.model;

public class ProductCatalog {

    private String productId;
    private String productInfo;
    private String productPaymentInfo;

    public ProductCatalog() {
    }

    public ProductCatalog(String productId, String productInfo, String productPaymentInfo) {
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

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductPaymentInfo() {
        return productPaymentInfo;
    }

    public void setProductPaymentInfo(String productPaymentInfo) {
        this.productPaymentInfo = productPaymentInfo;
    }
}
