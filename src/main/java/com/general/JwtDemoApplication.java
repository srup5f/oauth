package com.general;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
@ContextConfiguration
@MapperScan("com.general.dao")
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

}
