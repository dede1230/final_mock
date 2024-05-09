package com.fpt.hurst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HurstApplication {

	public static void main(String[] args) {
		SpringApplication.run(HurstApplication.class, args);
	}
}
