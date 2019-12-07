package com.klxy.studraw_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.klxy.studraw_server.dao"})
@EnableSwagger2
public class StudrawServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudrawServerApplication.class, args);
    }

}
