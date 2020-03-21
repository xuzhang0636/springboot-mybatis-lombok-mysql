package com.xuzhang.springbootmybatismysqllombok;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuzhang.springbootmybatismysqllombok.mapper")
public class SpringBootMybatisMysqlLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisMysqlLombokApplication.class, args);
    }

}
