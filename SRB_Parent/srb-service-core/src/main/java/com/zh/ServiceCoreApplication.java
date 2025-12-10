package com.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"com.zh.srb"})
@MapperScan("com.zh.srb.core.mapper")
public class ServiceCoreApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceCoreApplication.class,args);
        System.out.println( "Hello World!" );
    }
}
