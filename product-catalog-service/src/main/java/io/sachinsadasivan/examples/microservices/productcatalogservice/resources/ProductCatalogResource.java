package io.sachinsadasivan.examples.microservices.productcatalogservice.resources;

import io.sachinsadasivan.examples.microservices.productcatalogservice.model.ProductCatalog;

import io.sachinsadasivan.examples.microservices.productcatalogservice.model.ProductInfo;
import io.sachinsadasivan.examples.microservices.productcatalogservice.model.ProductPaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product-catalog")
public class ProductCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("{productId}")
    public ProductCatalog getProductCatalog(@PathVariable("productId") String productId){
        
        ProductInfo productInfo =  restTemplate.getForObject("http://product-info-service/product-info/" + productId, ProductInfo.class);
        ProductPaymentInfo productPaymentInfo = restTemplate.getForObject("http://product-payment-service/product-payment-info/" + productId, ProductPaymentInfo.class);
        
        return new ProductCatalog(productId, productInfo, productPaymentInfo);
    }

}
