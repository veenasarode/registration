package com.loginproject.demologinpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class DemologinpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemologinpageApplication.class, args);
	}

}
