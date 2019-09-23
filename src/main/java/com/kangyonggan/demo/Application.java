package com.kangyonggan.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kangyonggan
 * @since 2019-09-19
 */
@SpringBootApplication
@MapperScan("com.kangyonggan.demo.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
