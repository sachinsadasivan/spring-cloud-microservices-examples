package io.sachinsadasivan.examples.microservices.productpaymentservice.resources;

import io.sachinsadasivan.examples.microservices.productpaymentservice.model.ProductPaymentInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-payment")
public class ProductPaymentResource {

    @RequestMapping("/paymentinfo/{productId}")
    public ProductPaymentInfo getProductPaymentInfo(@PathVariable("productId") String productId){
        Optional<ProductPaymentInfo> productPaymentInfo = getProductPaymentInfoList().stream().filter(paymentInfo -> paymentInfo.getProductId().equals(productId)).findFirst();
        return productPaymentInfo.orElse(new ProductPaymentInfo(productId, "None", 0.0));
    }

    private List<ProductPaymentInfo> getProductPaymentInfoList(){
        return Arrays.asList(
                new ProductPaymentInfo("phone", "Visa", 12),
                new ProductPaymentInfo("tab", "Mastercard", 10.25),
                new ProductPaymentInfo("game", "PayPal", 14.05),
                new ProductPaymentInfo("pc", "Visa", 5),
                new ProductPaymentInfo("tv", "Cash", 13),
                new ProductPaymentInfo("book", "Visa", 8)
        );
    }
}
