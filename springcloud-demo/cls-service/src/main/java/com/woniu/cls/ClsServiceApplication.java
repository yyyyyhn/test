package com.woniu.cls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.session.FlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.woniu.cls.mapper")
@EnableRedisHttpSession(flushMode = FlushMode.IMMEDIATE)
public class ClsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClsServiceApplication.class, args);
    }

}
