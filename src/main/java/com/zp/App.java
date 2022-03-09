package com.zp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.zp.mapper")
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
