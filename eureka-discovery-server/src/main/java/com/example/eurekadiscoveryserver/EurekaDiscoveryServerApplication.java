package com.example.eurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//Spring Framework for Java that is used to simplify the configuration of Spring-based applications
@SpringBootApplication
//@EnableEurekaServer is an annotation used in Spring Cloud to enable the Eureka server functionality.
@EnableEurekaServer
public class EurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
	}

}
