package com.example.springproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class PropertiesApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext ctx = SpringApplication.run(PropertiesApplication.class, args);

    System.out.println(ctx.getBean("myAppConfig"));

    System.out.println(ctx.getBean("datasource"));
	}
}
