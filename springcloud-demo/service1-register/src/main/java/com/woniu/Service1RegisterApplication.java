package com.woniu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Service1RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Service1RegisterApplication.class, args);
    }

}
