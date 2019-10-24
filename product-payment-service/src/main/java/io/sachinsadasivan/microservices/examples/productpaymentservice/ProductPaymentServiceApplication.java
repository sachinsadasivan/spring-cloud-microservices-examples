package io.sachinsadasivan.microservices.examples.productpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductPaymentServiceApplication.class, args);
	}

}
