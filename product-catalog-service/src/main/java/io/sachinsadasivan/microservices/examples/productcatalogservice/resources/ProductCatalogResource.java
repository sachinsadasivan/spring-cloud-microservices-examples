package io.sachinsadasivan.microservices.examples.productcatalogservice.resources;

import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductCatalog;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductInfo;
import io.sachinsadasivan.microservices.examples.productcatalogservice.model.ProductPaymentInfo;
import io.sachinsadasivan.microservices.examples.productcatalogservice.services.ProductInfoService;
import io.sachinsadasivan.microservices.examples.productcatalogservice.services.ProductPaymentInfoService;
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

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductPaymentInfoService productPaymentInfoService;

    @RequestMapping("/{productId}")
    public ProductCatalog getProductCatalog(@PathVariable("productId") String productId){

        ProductInfo productInfo = productInfoService.getProductInfo(productId);
        ProductPaymentInfo productPaymentInfo = productPaymentInfoService.getProductPaymentInfo(productId);

        return new ProductCatalog(productId, productInfo, productPaymentInfo);
    }

}
