package com.ryanbao.capricornus.alphaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ryanbao
 * @date 2018-10-19
 */
@SpringBootApplication
@EnableEurekaClient
public class AlphaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaServiceApplication.class, args);
	}
}
