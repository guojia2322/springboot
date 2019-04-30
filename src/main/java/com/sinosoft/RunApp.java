package com.sinosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class RunApp{
	public static void main(String[] args) {
		new SpringApplicationBuilder(RunApp.class).web(true).run(args);
	}
}
