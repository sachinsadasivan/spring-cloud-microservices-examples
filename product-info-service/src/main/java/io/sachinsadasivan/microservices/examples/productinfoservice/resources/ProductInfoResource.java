package io.sachinsadasivan.microservices.examples.productinfoservice.resources;

import io.sachinsadasivan.microservices.examples.productinfoservice.model.ProductInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product-info")
public class ProductInfoResource {

    @RequestMapping("/{productId}")
    public ProductInfo getProductInfo(@PathVariable("productId") String productId){
        Optional<ProductInfo> productInfo = getProductInfoList().stream().filter(product -> product.getProductId().equals(productId)).findFirst();
        return productInfo.orElse(new ProductInfo(productId, "Product does not exist for Product Id: " + productId, "None"));
    }

    private List<ProductInfo> getProductInfoList(){
        return Arrays.asList(
                new ProductInfo("phone", "iPhone", "Apple iPhone 11"),
                new ProductInfo("pc", "HP Elite Book", "HP Elite Book Laptop 16 GB"),
                new ProductInfo("tab", "Samsung Galaxy Tab", "Samsung Galaxy Tab 7 Inch"),
                new ProductInfo("tv", "LG TV", "LG Smart TV 55 Inch"),
                new ProductInfo("game", "Sony Playstation", "Sony Corporation")
        );
    }
}
