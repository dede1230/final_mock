package com.fpt.hurst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HurstApplication {

	public static void main(String[] args) {
		SpringApplication.run(HurstApplication.class, args);
	}
}
