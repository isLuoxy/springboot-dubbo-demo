package com.luo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
@MapperScan("com.luo.dao")
public class ImallSeckillWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallSeckillWebApplication.class, args);
    }

}
