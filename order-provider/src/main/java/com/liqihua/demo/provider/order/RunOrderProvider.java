package com.liqihua.demo.provider.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqihua
 * @since 2019/3/14
 */
@SpringBootApplication
@EnableEurekaClient
public class RunOrderProvider {

    public static void main(String[] args) {
        SpringApplication.run(RunOrderProvider.class, args);
    }

}
