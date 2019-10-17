package io.sachinsadasivan.examples.microservices.productinfoservice.resource;

import io.sachinsadasivan.examples.microservices.productinfoservice.model.ProductInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-info")
public class ProductInfoResource {

    @RequestMapping("{productId}")
    public ProductInfo getProductInfo(@PathVariable("productId") String productId){
        Optional<ProductInfo> productInfo = getProductInfoList().stream().filter(product -> product.getProductId().equals(productId)).findFirst();
        return productInfo.orElse(new ProductInfo(productId, "No Product", "None"));
    }

    public List<ProductInfo> getProductInfoList(){
        return Arrays.asList(
                new ProductInfo("phone", "iPhone 11", "Apple iPhone 11 - 32 GB Black"),
                new ProductInfo("tab", "Samsung Galaxy", "Samsung Galaxy Tab 10 Silver"),
                new ProductInfo("game", "Playstation", "Sony Playstation 4"),
                new ProductInfo("pc", "HP Elitebook", "HP Elitebook 16GB RAM"),
                new ProductInfo("tv", "LG TV", "LG TV 56 Inch"),
                new ProductInfo("book", "Java 8 in Action", "Java 8 In Action - Manning Publications")
                );
    }
}
