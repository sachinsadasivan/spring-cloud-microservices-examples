package io.sachinsadasivan.microservices.examples.productcatalogservice.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductInfo;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductPaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackProductInfo")
    public ProductInfo getProductInfo(@PathVariable("productId") String productId) {
        return restTemplate.getForObject("http://product-info-service/product-info/" + productId, ProductInfo.class);
    }

    public ProductInfo getFallbackProductInfo(@PathVariable("productId") String productId) {
        return new ProductInfo(productId, "Not available", "NA");
    }

}
