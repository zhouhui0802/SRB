package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan({"com.zh.srb", "com.zh.srb.common"})
public class ServiceOssApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceOssApp.class, args);
        System.out.println( "Hello World!" );
    }
}
