package io.sachinsadasivan.microservices.examples.productpaymentservice.resources;

import io.sachinsadasivan.microservices.examples.productpaymentservice.model.ProductPaymentInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-payment")
public class ProductPaymentResource {

    @RequestMapping("/{productId}")
    public ProductPaymentInfo getProductPaymentInfo(@PathVariable("productId") String productId){
        Optional<ProductPaymentInfo> productPaymentInfo = getProductPaymentInfoList().stream().filter(product -> product.getProductId().equals(productId)).findFirst();
        return productPaymentInfo.orElse(new ProductPaymentInfo(productId, "No Payment Information exist for Product Id: " + productId, 0));
    }

    private List<ProductPaymentInfo> getProductPaymentInfoList(){
        return Arrays.asList(
                new ProductPaymentInfo("phone", "Visa", 10),
                new ProductPaymentInfo("pc", "MasterCard", 6),
                new ProductPaymentInfo("tab", "PayPal", 4),
                new ProductPaymentInfo("tv", "Cash", 8),
                new ProductPaymentInfo("game", "Visa", 14)
        );
    }
}
