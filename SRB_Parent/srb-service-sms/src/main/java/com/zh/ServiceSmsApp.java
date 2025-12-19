package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Hello world!
 * 从短信服务变成短信认证
 */
@SpringBootApplication
@ComponentScan("com.zh.srb")
@EnableFeignClients
public class ServiceSmsApp
{
    public static void main( String[] args )
    {

        SpringApplication.run(ServiceSmsApp.class, args);
        System.out.println( "Hello World!" );
    }
}
