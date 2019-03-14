package com.liqihua.demo.consumer.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqihua
 * @since 2019/3/14
 */
@RestController
@RequestMapping("/testController")
public class TestController {
    public static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/test1")
    public String test1(String param){
        LOG.info("TestController -> test1() ...");
        String result = restTemplate.getForObject("http://order-provider/orderProviderContext/orderController/list?param="+param,String.class);
        LOG.info("TestController -> test1() result : {}",result);
        return "test1 get result : "+result;
    }



}
