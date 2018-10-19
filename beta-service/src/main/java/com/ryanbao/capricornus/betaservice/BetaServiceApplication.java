package com.ryanbao.capricornus.betaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ryanbao
 * @date 2018-10-19
 */
@SpringBootApplication
@EnableEurekaClient
public class BetaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaServiceApplication.class, args);
	}
}
