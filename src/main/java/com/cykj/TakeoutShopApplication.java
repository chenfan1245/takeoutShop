package com.cykj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cykj.mapper")
public class TakeoutShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeoutShopApplication.class, args);
        System.out.println("http://localhost:9907");
    }

}
