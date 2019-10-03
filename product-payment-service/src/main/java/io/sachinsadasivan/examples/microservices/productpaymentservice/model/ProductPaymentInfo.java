package io.sachinsadasivan.examples.microservices.productpaymentservice.model;

public class ProductPaymentInfo {

    private String productId;
    private String paymentType;
    private double salesTax;

    public ProductPaymentInfo() {
    }

    public ProductPaymentInfo(String productId, String paymentType, double salesTax) {
        this.productId = productId;
        this.paymentType = paymentType;
        this.salesTax = salesTax;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }
}
