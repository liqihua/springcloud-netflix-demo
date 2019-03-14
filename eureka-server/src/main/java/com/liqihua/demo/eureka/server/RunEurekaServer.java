package com.liqihua.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqihua
 * @since 2019/3/14
 */
@EnableEurekaServer
@SpringBootApplication
public class RunEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(RunEurekaServer.class, args);
    }

}
