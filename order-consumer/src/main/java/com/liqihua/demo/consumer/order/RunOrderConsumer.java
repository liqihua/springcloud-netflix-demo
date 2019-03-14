package com.liqihua.demo.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqihua
 * @since 2019/3/14
 */
@SpringBootApplication
@EnableEurekaClient
public class RunOrderConsumer {

    public static void main(String[] args) {
        SpringApplication.run(RunOrderConsumer.class, args);
    }


    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
