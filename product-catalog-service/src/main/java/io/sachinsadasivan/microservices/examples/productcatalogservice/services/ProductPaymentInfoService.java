package io.sachinsadasivan.microservices.examples.productcatalogservice.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductPaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductPaymentInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackProductPaymentInfo")
    public ProductPaymentInfo getProductPaymentInfo(@PathVariable("productId") String productId) {
        return restTemplate.getForObject("http://product-payment-service/product-payment/" + productId, ProductPaymentInfo.class);
    }

    public ProductPaymentInfo getFallbackProductPaymentInfo(@PathVariable("productId") String productId) {
        return new ProductPaymentInfo(productId, "No Payment Type available", 0);
    }
}
