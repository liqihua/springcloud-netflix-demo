package com.liqihua.demo.provider.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqihua
 * @since 2019/3/14
 */
@RestController
@RequestMapping("/orderController")
public class OrderController {
    public static final Logger LOG = LoggerFactory.getLogger(OrderController.class);


    @RequestMapping("/list")
    public String list(String param){
        LOG.info("OrderController -> list() param : {}",param);
        return "orderList get param : "+param;
    }


}
