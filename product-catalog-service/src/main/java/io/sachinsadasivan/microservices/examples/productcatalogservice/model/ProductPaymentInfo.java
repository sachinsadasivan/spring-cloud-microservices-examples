package io.sachinsadasivan.microservices.examples.productcatalogservice.model;

public class ProductPaymentInfo {

    private String productId;
    private String productPaymentType;
    private int salesTax;

    public ProductPaymentInfo() {
    }

    public ProductPaymentInfo(String productId, String productPaymentType, int salesTax) {
        this.productId = productId;
        this.productPaymentType = productPaymentType;
        this.salesTax = salesTax;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPaymentType() {
        return productPaymentType;
    }

    public void setProductPaymentType(String productPaymentType) {
        this.productPaymentType = productPaymentType;
    }

    public int getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(int salesTax) {
        this.salesTax = salesTax;
    }
}
