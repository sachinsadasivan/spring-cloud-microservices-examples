package io.sachinsadasivan.microservices.examples.productdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProductDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDiscoveryServerApplication.class, args);
	}

}
