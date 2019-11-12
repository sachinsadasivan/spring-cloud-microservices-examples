package io.sachinsadasivan.microservices.examples.productcatalogservice.resources;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductCatalog;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductInfo;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductPaymentInfo;
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

    @RequestMapping("/{productId}")
    @HystrixCommand(fallbackMethod = "getFallbackProductCatalog")
    public ProductCatalog getProductCatalog(@PathVariable("productId") String productId){

        ProductInfo productInfo = restTemplate.getForObject("http://product-info-service/product-info/" + productId, ProductInfo.class);
        ProductPaymentInfo productPaymentInfo = restTemplate.getForObject("http://product-payment-service/product-payment/" + productId, ProductPaymentInfo.class);

        return new ProductCatalog(productId, productInfo, productPaymentInfo);
    }

    public ProductCatalog getFallbackProductCatalog(@PathVariable("productId") String productId){

        ProductInfo productInfo = new ProductInfo(productId, "Not available", "NA");
        ProductPaymentInfo productPaymentInfo = new ProductPaymentInfo(productId, "No Payment Type available", 0);

        return new ProductCatalog(productId, productInfo, productPaymentInfo);
    }
}
