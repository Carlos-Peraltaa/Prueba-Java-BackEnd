package com.practicas.baselineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BaselineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaselineServiceApplication.class, args);
	}

}
