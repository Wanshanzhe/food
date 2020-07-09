package com.wsz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author by 完善者
 * @date 2020/7/7 16:16
 * @DESC
 */
@SpringBootApplication
@MapperScan("com.wsz.repository")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
