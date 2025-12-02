package com.zh.testmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zh.mapper")
@ComponentScan("com.zh.service")
public class TestMybatisPlusApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestMybatisPlusApplication.class, args);
    }

}
