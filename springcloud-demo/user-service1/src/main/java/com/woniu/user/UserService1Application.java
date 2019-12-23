package com.woniu.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.session.FlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.woniu.user.mapper")
@ImportResource("classpath:transaction.xml")
@EnableRedisHttpSession(flushMode = FlushMode.IMMEDIATE)
public class UserService1Application {

    public static void main(String[] args) {
        SpringApplication.run(UserService1Application.class, args);
    }

}
