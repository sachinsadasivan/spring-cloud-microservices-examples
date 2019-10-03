package io.sachinsadasivan.examples.microservices.productcatalogservice.resources;

import io.sachinsadasivan.examples.microservices.productcatalogservice.model.ProductCatalog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-catalog")
public class ProductCatalogResource {

    @RequestMapping("/products/{productId}")
    public ProductCatalog getProductCatalog(@PathVariable("productId") String productId){
        return new ProductCatalog(productId, "Apple iPhone", "Visa");
    }

}
