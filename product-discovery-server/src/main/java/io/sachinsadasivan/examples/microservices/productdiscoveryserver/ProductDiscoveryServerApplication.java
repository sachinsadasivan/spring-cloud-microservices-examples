package io.sachinsadasivan.examples.microservices.productdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class ProductDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDiscoveryServerApplication.class, args);
	}

}
