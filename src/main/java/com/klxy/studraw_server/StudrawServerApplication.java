package com.klxy.studraw_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.klxy.studraw_server.dao"})
public class StudrawServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudrawServerApplication.class, args);
	}

}
